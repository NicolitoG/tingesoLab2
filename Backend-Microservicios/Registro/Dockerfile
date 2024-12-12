FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} registro.jar
ENTRYPOINT ["java","-jar","/registro.jar"]