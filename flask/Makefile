
JSESH_DIR ?= $(PWD)/../bin/JSesh-6.5.5
CLASSPATH:=$(CLASSPATH):$(shell echo $(JSESH_DIR)/libJSesh/*.jar|tr ' ' :)

all: class/JSeshServer.class

class/JSeshServer.class: class JSeshServer.java
	javac -cp $(CLASSPATH) -d class JSeshServer.java

class:
	mkdir class

