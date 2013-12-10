#!/bin/bash

MAVEN_REPO_PATH=~/.m2/repository
JOOQ_VERSION=3.2.0

echo $MAVEN_REPO_PATH/org/jooq/jooq/3.2.0/jooq-3.2.0.jar
/usr/java/default/bin/java -cp $MAVEN_REPO_PATH/org/jooq/jooq/$JOOQ_VERSION/jooq-$JOOQ_VERSION.jar:$MAVEN_REPO_PATH/org/jooq/jooq-meta/$JOOQ_VERSION/jooq-meta-$JOOQ_VERSION.jar:$MAVEN_REPO_PATH/org/jooq/jooq-codegen/$JOOQ_VERSION/jooq-codegen-$JOOQ_VERSION.jar:$MAVEN_REPO_PATH/postgresql/postgresql/8.4-702.jdbc4/postgresql-8.4-702.jdbc4.jar:. org.jooq.util.GenerationTool /jooq-configuration.xml
