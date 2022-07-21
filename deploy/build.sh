#!/bin/bash

# java microservices: run tests and build docker image
(cd ../mserviceA;   ./mvnw clean package verify jib:dockerBuild)                            && P0=$!
(cd ../mserviceB;   ./mvnw clean package verify jib:dockerBuild)                            && P1=$!

# ui: install dependencies, run tests, AOT production build and build docker image
(cd ../ui;           npm install)                                                           && P2=$!
(cd ../ui;           npm test -- --watchAll=false)                                          && P3=$!
(cd ../ui;           npm run build)                                                         && P4=$!
(cd ../ui;           docker build -f ../deploy/nginx/ui-dockerfile . -t cicdqa/ui:1.0.0)    && P5=$!

wait $P0 $P1 $P2 $P3 $P4 $P5
