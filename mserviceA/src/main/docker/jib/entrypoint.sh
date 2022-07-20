#!/bin/sh

echo "*** Starting MicroService A ***"
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp /app/resources/:/app/classes/:/app/libs/* "org.cicdqa.mservice.a.MserviceAApplication"  "$@"
