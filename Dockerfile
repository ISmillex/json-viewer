FROM ubuntu:latest AS build

RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    apt-get install -y maven

COPY . .

RUN mvn clean install

FROM openjdk:11-jdk-slim

EXPOSE 8080

COPY --from=build /target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]