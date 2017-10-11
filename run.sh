#!/bin/sh

qvm-run --win win7 rmdir /s /q 'C:\Users\user\Documents\QubesIncoming\bts\x86_64'
qvm-copy-to-vm win7 infrastructure/product/target/products/org.bbaw.bts.app.product/win32/win32/x86_64

qvm-run --win win7 rmdir /s /q 'C:\Users\user\Documents\QubesIncoming\bts\rundir\p2'
qvm-run --win win7 rmdir /s /q 'C:\Users\user\Documents\QubesIncoming\bts\rundir\plugins'
qvm-run --win win7 rmdir /s /q 'C:\Users\user\Documents\QubesIncoming\bts\rundir\features'

for f in p2 plugins features BTS.exe eclipsec.exe artifacts.xml; do
    qvm-run --win win7 move /y 'C:\Users\user\Documents\QubesIncoming\bts\x86_64\'$f 'C:\Users\user\Documents\QubesIncoming\bts\rundir\'$f
done

qvm-run --win win7 'C:\Users\user\Documents\QubesIncoming\bts\rundir\BTS.exe' -debug -vmargs -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005

