#!/bin/sh
##### SETUP THIS ENV VARIABLE IN OS
# JAVA_HOME=/usr/jdk/entsys-j2se
# LANG=sk_SK.UTF-8
# export LANG
######
$JAVA_HOME/bin/java -Djava.util.logging.config.file=conf/logging.properties -jar kallithea-ldap-sync.jar $*
