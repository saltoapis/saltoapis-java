load("//:rules.bzl", "load_rules")
load("@rules_jvm_external//:defs.bzl", "artifact")

package(default_visibility = ['//:__subpackages__'])

load_rules(
    lib_name = 'auth',
    internal_dependencies = [
    ],
    extra_info = {
        'group_name': 'com.saltoapis.auth',
        'additional_deps': [
            artifact('com.fasterxml.jackson.jr:jackson-jr-objects'),
        ],
    },
)
