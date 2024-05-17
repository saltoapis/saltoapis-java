
SHELL = /bin/bash

REPORTS_DIR ?= .reports

# Overridable by CI
COMMIT_SHORT     ?= $(shell git rev-parse --verify --short HEAD)
VERSION_NOPREFIX ?= "0.0.0-sha.$(COMMIT_SHORT)"
VERSION          ?= "v$(VERSION_NOPREFIX)"

#
# Common methodology based targets
#
.PHONY: prepare
prepare:

.PHONY: sanity-check
sanity-check:

.PHONY: build
build:
	bazel build :build_all

.PHONY: test
test:

.PHONY: release
release:
	bazel run :publish_all --define version=$(VERSION_NOPREFIX)

.PHONY: clean
clean:
	bazel clean