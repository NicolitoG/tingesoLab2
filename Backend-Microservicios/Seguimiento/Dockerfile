FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Seguimiento.jar
ENTRYPOINT ["java","-jar","/eureka-service.jar"]