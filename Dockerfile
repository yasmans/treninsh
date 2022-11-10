FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/treninsh*SNAPSHOT.jar
COPY ${JAR_FILE} treninsh.jar
ENTRYPOINT ["java","-jar","/treninsh.jar"]
