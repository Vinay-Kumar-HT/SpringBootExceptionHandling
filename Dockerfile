FROM openjdk:11
EXPOSE 8080
ADD target/springboot-action.jar springboot-action.jar
ENTRYPOINT ["java","-jar", "/springboot-action.jar"]
