# CICD-QA-Sample
A simple project to show a complete automated product pipeline with CI/CD and QA using GitHub Actions and SonarCloud.

Project structure:
- .github       (GitHub Actions for PRs and Product Release)
- deploy        (instant dev run for the project, docker-build and docker-compose)
- deploy/nginx  (nginx proxy dockerfile and site.conf proxy configuration)
- mserviceA     (Spring Boot Java BE micro-service)
- mserviceB     (Spring Boot Java BE micro-service)
- ui            (React FE application)
