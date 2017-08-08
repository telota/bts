
WGET ?= wget --timestamping

.PHONY: sync_deps

all: sync_deps

.PHONY: clean
clean:
	rm $(filter-out Makefile $(shell egrep '^sync_deps: ' dependencies.mk|cut -d' ' -f2),$(wildcard *))

.PHONY: mrproper
mrproper: clean
	rm $(wildcard *.jar)

include dependencies.mk

