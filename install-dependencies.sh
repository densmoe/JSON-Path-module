#!/bin/sh

MODULE_VERSION=2.0.0

rm -rf ./userlib/*
rm -rf ./deployment
mvn dependency:copy-dependencies
for JAR_FILE in $(find ./userlib -type f -name "*.jar")
do
	touch ${JAR_FILE}.JSONPath-${MODULE_VERSION}.RequiredLib
done
cp ./pom.xml ./resources/JSONPath
