FROM openjdk:17
LABEL maintainer="kmohanshetty@gmail.com"
EXPOSE 8080
ADD target/spring-backend.jar spring-backend.jar
ENTRYPOINT  ["java", "-jar", "/spring-backend.jar"]