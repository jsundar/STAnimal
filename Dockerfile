FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-animal-docker.jar spring-boot-animal-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-animal-docker.jar"]