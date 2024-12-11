FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-creditrequest.jar
ENTRYPOINT ["java","-jar","/ms-creditrequest.jar"]