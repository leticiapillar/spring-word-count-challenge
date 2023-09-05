FROM gradle:8.3.0-jdk20-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:21-oracle
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/word-count-challenge.jar
ENTRYPOINT ["java", "-jar", "/app/word-count-challenge.jar"]