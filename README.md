# CICD-QA-Sample
A simple project to show a complete automated product pipeline with CI/CD and QA using GitHub Actions and SonarCloud.

The project consists of two Java Spring-Boot micro-services and a React UI

**Project structure:**
- .github       (GitHub Actions for PRs and Product Release)
- deploy        (project-build and docker-compose files)
- deploy/nginx  (nginx proxy Dockerfile and site.conf proxy configuration)
- mserviceA     (Spring-Boot Java BE micro-service)
- mserviceB     (Spring-Boot Java BE micro-service)
- ui            (React FE application)

**Java Micro-seriveces:**
- Java 11, Maven
- test are performed using junit jupiter and reported by jacoco,
  integration tests must end with *IT
- the docker build is performed using jib with eclipse-temurin:11-jre-focal
  as base docker image
- env variables are configured through application.properties

**React UI:**
- react 18.0.9
- tests are performed using jest and reported by jest-sonar-scanner
- the docker build is performed using nginx:1.15-alpine as base 
  docker image, AOT build is copied in the base
  image using a Dockerfile (ui-dockerfile), while the site.conf for nginx proxy
  is passed through volume definition in the docker-compose

**Sonar Cloud:**
- projects have been created manually in the Sonar Cloud web platform
  and configurations are expressed through sonar-project.properties
  files

**GitHub Actions:**
- configured programmatically in .github/workflows
- triggered by PRs and push on the **main** branch, push on specific branch
  and published release
- perform tests run, build, sonar analysis and optionally pusblish docker
images on the GitHub ghcr.io registry

**Run Project**
- LOCAL mvn + npm
    - from the mserviceA foler, run `mvn spring-boot:run`
    - from the mserviceB foler, run `mvn spring-boot:run`
    - from the ui folder, run `npm install`, then, `npm start`
- LOCAL docker:
    - from the deploy folder, run `./build.sh` or `./build-no-test.sh`
    - from the deploy folder, run
      `docker-compose -f docker-compose-local.yml`
- DEV_ENV docker:
    - change watchtower service volumes to match your folder structure 
      in deploy/docker-compose-dev-env.yml
    - from the deploy folder, run
      `docker-compose -f docker-compose-dev-env.yml` 
- **PROD** docker    
    - change watchtower service volumes to match your folder structure
      in deploy/docker-compose-prod.yml
    - from the deploy folder, run
      `docker-compose -f docker-compose-prod.yml` 
