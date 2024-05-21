load("@rules_jvm_external//:defs.bzl", "artifact")
load("//scripts:release.bzl", "generate_pom", "publish_to_artifactory")
load("@rules_java//java:defs.bzl", "java_library")

def load_rules(lib_name, internal_dependencies, extra_info):
    """A macro that loads common rules for all the packages

    Args:
        lib_name: the name of the package
        internal_dependencies: the internal dependencies of the package
        extra_info: additional information required by the following rules (android package, maven group name)
    """
    
    # build java library
    group_name = extra_info['group_name']
    java_library(
        name = 'build',
        srcs = native.glob(["**/*.java"]),
        deps = [
            artifact("io.grpc:grpc-protobuf"),
            artifact("io.grpc:grpc-stub"),
            artifact("javax.annotation:javax.annotation-api"),
            artifact("com.google.protobuf:protobuf-java"),

            artifact("io.grpc:grpc-api"),
            artifact("com.google.guava:guava"),

        ] + ["{}:build".format(dep) for dep in internal_dependencies],
        tags = ['maven_coordinates=%s:%s:{pom_version}' % (group_name, lib_name) ],
    )
    
    # generate pom
    generate_pom(
        name = 'generate_pom',
        target = ':build',
        project_url = 'https://github.com/saltoapis/saltoapis-java',
        project_name = lib_name,
        packaging = 'jar',
    )

    # publish artifact (needs version: --define version=X.X.X)
    publish_to_artifactory(
        name = 'publish',
        pom_file = ':generate_pom',
        target = ':libbuild.jar',
        sources = ':libbuild-src.jar',
        url = 'https://maven.pkg.github.com/saltoapis/saltoapis-java',
        requires_auth = True,
    )
