# Paso 1: Compilación con Maven y OpenJDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests

# Paso 2: Imagen ligera de ejecución con Java 21 y Wallet incluida
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copiar el empaquetado JAR desde la etapa build
COPY --from=build /target/plataforma-0.0.1-SNAPSHOT.jar app.jar

# Asegurar la persistencia de la Wallet de Oracle dentro del contenedor de ejecución
COPY --from=build /src/main/resources/wallet /app/src/main/resources/wallet

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]