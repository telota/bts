
WGET ?= wget --timestamping

.PHONY: sync_deps

all: sync_deps

.PHONY: mrproper
mrproper:
	rm $(filter-out Makefile $(shell egrep '^sync_deps: ' dependencies.mk|cut -d' ' -f2),$(wildcard *))

include dependencies.mk

