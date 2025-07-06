FROM openjdk:17
EXPOSE 8080
ADD target/springboot-gha-project-image.jar springboot-gha-project-image.jar
ENTRYPOINT ["java", "-jar", "springboot-gha-project-image.jar"]