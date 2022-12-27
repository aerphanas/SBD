FROM openjdk:17-jdk-alpine
LABEL org.opencontainers.image.source=https://github.com/aerphanas/SBD
LABEL org.opencontainers.image.description=" Spring boot hello world on docker "
LABEL org.opencontainers.image.licenses=MIT
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]