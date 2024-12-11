FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-creditevaluation.jar
ENTRYPOINT ["java","-jar","/ms-creditevaluation.jar"]