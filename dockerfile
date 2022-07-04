FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /target/flight.jar
ENTRYPOINT ["java","-jar","target/flight.jar"]
EXPOSE 8080