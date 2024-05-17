"""
The providers, aspects and rules defined in this file are based
on "https://github.com/graknlabs/bazel-distribution" repository.
We have implemented our own solution from scratch for the following
reasons:

Their implementation for pom generation and maven release does not
currently support Android Archive files.
See: https://github.com/graknlabs/bazel-distribution/issues/233

And when we tried to add support for aar files to their project, we
had issues with aspects. They do not seem to work on implicit output
targets. See: https://github.com/bazelbuild/bazel/issues/11545

This forced us to change the way the release rule was defined and how
artifacts were deployed to maven.
"""

MavenPomInfo = provider(
    fields = {
        'target_coordinates': 'Maven coordinates for current target',
        'maven_pom_deps': 'Maven coordinates for dependencies',
    }
)

_MAVEN_POM_INFO_EMPTY = MavenPomInfo(
    target_coordinates = depset(),
    maven_pom_deps = depset(),
)

_TAG_KEY_MAVEN_COORDINATES = "maven_coordinates="

def _target_coordinates(targets):
    return [target[MavenPomInfo].target_coordinates for target in targets]

def _maven_pom_deps_impl(_target, ctx):
    tags = getattr(ctx.rule.attr, "tags", [])
    deps = getattr(ctx.rule.attr, "deps", [])

    maven_coordinates = []

    for tag in tags:
        if tag in ("maven:compile_only", "maven:shaded"):
            return _MAVEN_POM_INFO_EMPTY
        if tag.startswith(_TAG_KEY_MAVEN_COORDINATES):
            coordinate = tag[len(_TAG_KEY_MAVEN_COORDINATES):]
            target_is_in_root_workspace = _target.label.workspace_root == ""
            if coordinate.endswith('{pom_version}') and not target_is_in_root_workspace:
                maven_coordinates.append(coordinate.replace('{pom_version}', _target.label.workspace_root.replace('external/', '')))
            else:
                maven_coordinates.append(coordinate)

        if len(maven_coordinates) > 1:
            fail("You should not set more than one maven_coordinates tag per java_library")

    # This seems to be all the direct dependencies of this given _target
    deps_coordinates = _target_coordinates(deps)

    return [MavenPomInfo(target_coordinates = maven_coordinates[-1], maven_pom_deps = deps_coordinates)]

# Filled in by deployment_rules_builder
_maven_packages = "{maven_packages}".split(",")
_maven_pom_deps = aspect(
    attr_aspects = [
        "deps",
    ],
    implementation = _maven_pom_deps_impl,
    provides = [MavenPomInfo]
)


#############################
####    MAVEN ASSEMBLY   ####
#############################

def _parse_maven_coordinates(coordinate_string):
    group_id, artifact_id, version = coordinate_string.split(':')
    if version != '{pom_version}':
        fail('should assign {pom_version} as Maven version via `tags` attribute')
    return struct(
        group_id = group_id,
        artifact_id = artifact_id,
    )

def _generate_pom_xml(ctx, maven_coordinates):
    pom_file = ctx.actions.declare_file("{}_pom.xml".format(ctx.attr.name))

    maven_pom_deps = ctx.attr.target[MavenPomInfo].maven_pom_deps
    deps_coordinates = depset(maven_pom_deps).to_list()

    DEP_BLOCK = """        <dependency>
            <groupId>{0}</groupId>
            <artifactId>{1}</artifactId>
            <version>{2}</version>
        </dependency>"""
    xml_tags = []
    for coord in deps_coordinates:
        xml_tags.append(DEP_BLOCK.format(*coord.split(":")))

    version = ctx.var.get('version', '0.0.0')

    project_name = ctx.attr.project_name
    if not project_name:
        project_name = maven_coordinates.artifact_id
    
    ctx.actions.expand_template(
        template = ctx.file._pom_xml_template,
        output = pom_file,
        substitutions = {
            "{project_name}": ctx.attr.project_name,
            "{project_description}": ctx.attr.project_description,
            "{project_url}": ctx.attr.project_url,
            "{target_group_id}": maven_coordinates.group_id,
            "{target_artifact_id}": maven_coordinates.artifact_id,
            "{target_deps_coordinates}": "\n".join(xml_tags),
            "{pom_version}": version,
            "{packaging}": ctx.attr.packaging,
        }
    )

    return pom_file

def _generate_pom_impl(ctx):
    target = ctx.attr.target

    target_string = target[MavenPomInfo].target_coordinates

    maven_coordinates = _parse_maven_coordinates(target_string)

    pom_file = _generate_pom_xml(ctx, maven_coordinates)

    return [DefaultInfo(files = depset([pom_file]))]

generate_pom = rule(
    attrs = {
        "target": attr.label(
            mandatory = True,
            allow_files = True,
            aspects = [
                _maven_pom_deps,
            ],
            doc = "Java target for pom generation"
        ),
        "packaging": attr.string(
            doc = 'Project packaging to fill into pom.xml, "jar" will be used if empty',
            default = 'jar',
        ),
        "project_name": attr.string(
            doc = 'Project name to fill into pom.xml, artifact will be used if empty'
        ),
        "project_description": attr.string(
            doc = 'Project description to fill into pom.xml'
        ),
        "project_url": attr.string(
            doc = 'Project URL to fill into pom.xml'
        ),
        "_pom_xml_template": attr.label(
            allow_single_file = True,
            default = ":pom.xml.tmpl",
        ),
    },
    implementation = _generate_pom_impl,
    doc = "Assemble Java package for subsequent deployment to Maven repo"
)


############################
####    MAVEN PUBLISH   ####
############################

def _create_settings_xml(ctx):
    settings_content = """<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
    <servers>
        <server>
            <id>{id}</id>
            <username>{username}</username>
            <password>{password}</password>
        </server>
    </servers>
</settings>""".format(
        id = ctx.label.name,
        username = ctx.attr.user,
        password = ctx.attr.password,
    )

    settings_file = ctx.actions.declare_file('settings.xml')
    ctx.actions.write(
        output = settings_file,
        content = settings_content,
    )
    return settings_file

def _publish_to_artifactory(ctx):
    pom = ctx.file.pom_file
    target = ctx.file.target
    sources = ctx.file.sources
    packaging = target.extension
    url = ctx.attr.url

    result = ctx.actions.declare_file('publish.sh')

    required_files = [result, target, pom ]
        
    args = [
        '-Dfile="%s"' % target.path,
        '-DpomFile="%s"' % pom.path,
        '-Dpackaging="%s"' % packaging,
        '-Durl="%s"' % url,
    ]
    if sources:
        required_files.append(sources)
        args.append('-Dsources="%s"' % sources.path)

    # if server need auth: create custom settings.xml
    if ctx.attr.requires_auth:
        settings_file = _create_settings_xml(ctx)
        required_files.append(settings_file)
        args += [
            '-DrepositoryId="%s"' % ctx.label.name,
            '-s "%s"' % settings_file.path,
        ]

    ctx.actions.write(
        output = result,
        content = 'mvn deploy:deploy-file %s' % ' '.join(args),
        is_executable = True,
    )

    return DefaultInfo(
        files = depset(required_files),
        executable = result, 
        runfiles = ctx.runfiles(files = required_files)
    )


publish_to_artifactory = rule(
    attrs = {
        'pom_file': attr.label(
            allow_single_file = True,
            mandatory = True,
        ),
        'target': attr.label(
            allow_single_file = True,
            mandatory = True,
        ),
        'sources': attr.label(
            allow_single_file = True,
        ),
        'url': attr.string(
            mandatory = True,
        ),
        'requires_auth': attr.bool(),
        'user': attr.string(),
        'password': attr.string(),
    },
    executable = True,
    implementation = _publish_to_artifactory,
)