FROM openjdk:11
expose 8080
ADD target/docker-app.jar docker-app.jar
ENTRYPOINT [ "java","jar","/docker-app.jar"]
