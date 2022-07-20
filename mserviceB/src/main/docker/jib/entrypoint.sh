#!/bin/sh

echo "*** Starting MicroService B ***"
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp /app/resources/:/app/classes/:/app/libs/* "org.cicdqa.mservice.b.MserviceBApplication"  "$@"
