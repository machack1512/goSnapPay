FROM openjdk:17
WORKDIR /app
COPY target/gosnappay.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]