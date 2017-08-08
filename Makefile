
LIB ?= lib
SRC ?= src

all: jar

$(LIB)/dependencies.mk: notmaven.py dependencies.py
	python3 notmaven.py dep_makefile > $(LIB)/dependencies.mk

.PHONY: sync_deps
sync_deps: $(LIB)/dependencies.mk
	$(MAKE) -C $(LIB)

.PHONY: jar
jar: $(LIB)/dependencies.mk sync_deps
	$(MAKE) -C $(SRC)

.PHONY: clean
clean:
	$(MAKE) -C $(LIB) clean
	$(MAKE) -C $(SRC) clean

.PHONY: mrproper
mrproper: clean
	$(MAKE) -C $(LIB) mrproper
	$(MAKE) -C $(SRC) clean
