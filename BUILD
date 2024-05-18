load("//:java_metadata.bzl", "java_projects")

filegroup(
    name = 'build_all',
    srcs = ["{}:build".format(project) for project in java_projects]
)

genrule(
    name = 'publish_all',
    srcs = ["{}:publish".format(project) for project in java_projects],
    outs = ['publish_all.sh'],
    cmd = 'echo "$(SRCS)" | sed -e "s/ /\\n/g" | grep -E "*.sh" > $@',
    executable = True,
)