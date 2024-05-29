FROM openjdk:22-jdk-slim

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

RUN ./mvnw dependency:resolve

COPY src src

RUN ./mvnw package -DskipTests

EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/GestaoTrafego-0.0.1-SNAPSHOT.jar"]
