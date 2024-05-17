load("@rules_jvm_external//:defs.bzl", "artifact")
load("//scripts:release.bzl", "generate_pom", "publish_to_artifactory")

load("@env_build//:secrets.bzl","ANDROID_MIN_SDK_VERSION", "ANDROID_SDK_VERSION")
load("@env_publish//:secrets.bzl","GITHUB_ACTOR", "GITHUB_TOKEN")

load("@build_bazel_rules_android//android:rules.bzl", "android_library")


def generate_android_manifest(android_package):
    manifest = """
<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"
    package="{package}">
    <uses-sdk android:minSdkVersion="{min_sdk}"
              android:targetSdkVersion="{target_sdk}" />
</manifest>
    """.format(
        package = android_package,
        min_sdk = ANDROID_MIN_SDK_VERSION,
        target_sdk = ANDROID_SDK_VERSION,
    )

    return manifest


def load_rules(lib_name, internal_dependencies, extra_info):
    """A macro that loads common rules for all the packages

    Args:
        lib_name: the name of the package
        internal_dependencies: the internal dependencies of the package
        extra_info: additional information required by the following rules (android package, maven group name)
    """
    
    # generate manifest
    manifest = generate_android_manifest(extra_info['android_package'])
    native.genrule(
        name = 'generate_manifest',
        outs = [ 'AndroidManifest.xml' ],
        cmd = "echo '%s' > $@" % manifest,
        message = 'Generating AndroidManifest.xml',
    )

    # build android library
    group_name = extra_info['group_name']
    android_library(
        name = 'build',
        srcs = native.glob(["**/*.java"]),
        manifest = ":generate_manifest",
        resource_files = native.glob(['res/**']),
        deps = [
            artifact("io.grpc:grpc-okhttp"),
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
        packaging = 'aar',
    )

    # publish artifact (needs version: --define version=X.X.X)
    publish_to_artifactory(
        name = 'publish',
        pom_file = ':generate_pom',
        target = ':build.aar',
        sources = ':libbuild-src.jar',
        url = 'https://maven.pkg.github.com/saltoapis/saltoapis-java',
        requires_auth = True,
        user = GITHUB_ACTOR,
        password = GITHUB_TOKEN,
    )
