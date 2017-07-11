#!/bin/sh
../org.bbaw.bts.app.product/target/products/org.bbaw.bts.app.product/linux/gtk/x86_64/BTS -debug -vmargs -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
