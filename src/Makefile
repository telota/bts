
SOURCES := $(shell find -name '*.java' -and -not -path './bts/transform/*')
VERSION ?= git-$(shell git show -s --format=%h)
TARGET := bts-$(VERSION).jar

JFLAGS ?=
LIB := ../$(LIB)
export LIB
CPATH += $(wildcard $(JSESH_LIB)/*.jar)
CPATH += $(shell egrep '^sync_deps:' $(LIB)/dependencies.mk|cut -d' ' -f2|sed s,^,$(LIB)/,)

export CLASSPATH := $(shell echo $(CPATH)|tr ' ' :):

all: $(TARGET)

.PHONY: generate_sources
generate_sources:
	#FIXME
	#java org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher file://$(shell pwd)/org/bbaw/bts/corpus/text/egy/GenerateEgyDsl.mwe2

classes: $(SOURCES:.java=.class.d)
	find -name '*.class' > classes

$(TARGET): manifest.mf classes
	jar cf $(TARGET) manifest.mf @classes

%.class.d: %.java
	@echo -e '\e[37m' javac $< '\e[0m'
	@echo -ne '\e[93m'
	@javac $(JFLAGS) $<
	@echo -ne '\e[0m'
	@touch $@

.PHONY: clean
clean:
	find -name '*.class' -delete
	find -name '*.class.d' -delete
	rm -f $(TARGET)

