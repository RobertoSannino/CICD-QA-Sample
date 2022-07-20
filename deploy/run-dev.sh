#!/bin/bash

echo "*** Starting Micro-Service A ***"
cd ../mserviceA
nohup mvn spring-boot:run &

echo "*** Starting Micro-Service B ***"
cd ../mserviceB
nohup mvn spring-boot:run &

echo "*** Starting UI ***"
cd ../ui
npm install
npm start
