#!/bin/bash

# java microservices: build docker image
(cd ../mserviceA;   ./mvnw clean package verify -DskipTests jib:dockerBuild)                && P0=$!
(cd ../mserviceB;   ./mvnw clean package verify -DskipTests jib:dockerBuild)                && P1=$!

# ui: install dependencies, AOT production build and build docker image
(cd ../ui;           npm install)                                                           && P2=$!
(cd ../ui;           npm run build)                                                         && P3=$!
(cd ../ui;           docker build -f ../deploy/nginx/ui-dockerfile . -t cicdqa/ui:1.0.0)    && P4=$!

wait $P0 $P1 $P2 $P3 $P4
