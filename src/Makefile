
SOURCES := $(shell find -name '*.java')
VERSION ?= git-$(shell git show -s --format=%h)
TARGET := bts-$(VERSION).jar

JFLAGS ?=
export LIB ?= ../lib
export CLASSPATH := $(shell egrep '^sync_deps:' $(LIB)/dependencies.mk|cut -d' ' -f2|sed s,^,$(LIB)/,|paste -sd:):$(CLASSPATH)

all: $(TARGET)

$(TARGET): manifest.mf $(SOURCES:.java=.class)
	jar cf $(TARGET) manifest.mf $^

%.class: %.java
	@echo -e '\e[37m' javac $< '\e[0m'
	@echo -ne '\e[93m'
	@javac $(JFLAGS) $<
	@echo -ne '\e[0m'

.PHONY: clean
clean:
	rm -f $(SOURCES:.java=.class)

