
JSESH_LIB ?= $(wildcard ~/JSesh-6.5.5/libJSesh)
LIB ?= lib
SRC ?= src

export LIB SRC JSESH_LIB

all: jar

$(LIB)/dependencies.mk: notmaven.py dependencies.py
	python3 notmaven.py dep_makefile > $(LIB)/dependencies.mk

.PHONY: sync_deps
sync_deps: $(LIB)/dependencies.mk
	$(MAKE) -C $(LIB)

.PHONY: generate_sources
generate_sources: sync_deps
	$(MAKE) -C $(SRC) generate_sources

.PHONY: jar
jar: $(LIB)/dependencies.mk generate_sources
	$(MAKE) -C $(SRC)

.PHONY: clean
clean:
	$(MAKE) -C $(LIB) clean
	$(MAKE) -C $(SRC) clean

.PHONY: mrproper
mrproper: clean
	$(MAKE) -C $(LIB) mrproper
	$(MAKE) -C $(SRC) clean
