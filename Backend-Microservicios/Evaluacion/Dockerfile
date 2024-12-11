FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Evaluacion.jar
ENTRYPOINT ["java","-jar","/eureka-service.jar"]