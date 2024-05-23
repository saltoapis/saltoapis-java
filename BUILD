load("//:java_metadata.bzl", "java_projects")

all_projects = java_projects + [ "//auth/src/main/java" ]

filegroup(
    name = 'build_all',
    srcs = ["{}:build".format(project) for project in all_projects]
)

genrule(
    name = 'publish_all',
    srcs = ["{}:publish".format(project) for project in all_projects],
    outs = ['publish_all.sh'],
    cmd = 'echo "$(SRCS)" | sed -e "s/ /\\n/g" | grep -E "*.sh" > $@',
    executable = True,
)
