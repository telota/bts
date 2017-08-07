
LIB ?= lib
SRC ?= src

all: sync_deps jar

$(LIB)/dependencies.mk: notmaven.py dependencies.py
	python3 notmaven.py dep_makefile > $(LIB)/dependencies.mk

.PHONY: sync_deps
sync_deps: $(LIB)/dependencies.mk
	make -C $(LIB)

.PHONY: jar
jar: $(LIB)/dependencies.mk
	make -C $(SRC)

