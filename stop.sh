#!/bin/sh
qvm-run --win win7 taskkill /im BTS.exe
qvm-run --win win7 taskkill /im java.exe
qvm-run --win win7 taskkill /f /im erl.exe
