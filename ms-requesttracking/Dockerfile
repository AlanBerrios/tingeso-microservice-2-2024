FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-requesttracking.jar
ENTRYPOINT ["java","-jar","/ms-requesttracking.jar"]