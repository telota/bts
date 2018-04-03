#!/bin/sh
./stop.sh
qvm-run --win win7 rmdir /s /q 'C:\Users\user\Documents\QubesIncoming\bts\x86_64'
qvm-copy-to-vm win7 org.bbaw.bts.app.product/target/products/org.bbaw.bts.app.product/win32/win32/x86_64
qvm-run --win win7 robocopy /E /MOV 'C:\Users\user\Documents\QubesIncoming\bts\x86_64\plugins' 'C:\Users\user\Documents\QubesIncoming\bts\rundir\plugins'
qvm-run --win win7 robocopy /E /MOV 'C:\Users\user\Documents\QubesIncoming\bts\x86_64\configuration' 'C:\Users\user\Documents\QubesIncoming\bts\rundir\configuration'
#qvm-run --win win7 'C:\Users\user\Documents\QubesIncoming\bts\rundir\BTS.exe' -debug -vmargs -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
python3 colorize.py qvm-run --win win7 '"C:\Program Files\Java\jre1.8.0_161\bin\java.exe"' -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Declipse.consoleLog=true -jar 'C:\Users\user\Documents\QubesIncoming\bts\rundir\plugins\org.eclipse.equinox.launcher_1.3.201.v20161025-1711.jar'
#qvm-run --win win7 '"C:\Program Files\Java\jre1.8.0_161\bin\java.exe"' -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Declipse.consoleLog=true -jar 'C:\Users\user\Documents\QubesIncoming\bts\rundir\plugins\org.eclipse.equinox.launcher_1.3.201.v20161025-1711.jar'
