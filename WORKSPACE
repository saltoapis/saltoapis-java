load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# add jvm rules to load external Maven dependencies
RULES_JVM_EXTERNAL_TAG = "3.0"
RULES_JVM_EXTERNAL_SHA = "62133c125bf4109dfd9d2af64830208356ce4ef8b165a6ef15bbff7460b35c3a"
http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

# Android build rules
http_archive(
    name = "build_bazel_rules_android",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
)


# define versions for grpc dependencies
load("//:java_metadata.bzl", "GRPC_JAVA_VERSION", "PROTOBUF_VERSION")
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "io.grpc:grpc-protobuf:%s" % GRPC_JAVA_VERSION,
        "io.grpc:grpc-stub:%s" % GRPC_JAVA_VERSION,
        "com.google.protobuf:protobuf-java:4.%s" % PROTOBUF_VERSION,
        "javax.annotation:javax.annotation-api:1.3.2",
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://jcenter.bintray.com/",
        "https://maven.google.com",
    ],
)

# import rules to load environment variables into BUILD files
RULES_BUILD_SECRETS_COMMIT = "103b222eba64355b93649b06ecfe3844466b5a65"
http_archive(
    name = "rules_build_secrets",
    strip_prefix = "rules_build_secrets-%s" % RULES_BUILD_SECRETS_COMMIT,
    sha256 = "e53e46eab662c313f0e011f1c7872602be1d90d988152f89525ce732190e32e7",
    url = "https://github.com/solarhess/rules_build_secrets/archive/%s.zip" % RULES_BUILD_SECRETS_COMMIT,
)

load("@rules_build_secrets//lib:secrets.bzl", "environment_secrets")

environment_secrets(
    name="env_publish", 
    entries = {
        "GITHUB_ACTOR": "",
        "GITHUB_TOKEN": "",
    },
)
