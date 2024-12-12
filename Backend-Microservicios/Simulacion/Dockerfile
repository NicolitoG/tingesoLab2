FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} simulacion.jar
ENTRYPOINT ["java","-jar","/simulacion.jar"]