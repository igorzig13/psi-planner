# Imagem base com Java 17
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/psi-planner-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
