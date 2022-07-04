FROM openjdk:8
ARG JAR_FILE=./target/AeroplaneReservation-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} flight.jar
ENTRYPOINT ["java","-jar","flight.jar"]
EXPOSE 8080