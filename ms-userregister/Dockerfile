FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-userregister.jar
ENTRYPOINT ["java","-jar","/ms-userregister.jar"]