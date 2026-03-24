FROM eclipse-temurin:17-jdk
EXPOSE 8080
ADD target/docker-jenkins-integration-sample-0.2.jar docker-jenkins-integration-sample-0.2.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-sample-0.2.jar"]