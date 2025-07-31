FROM docker.io/maven:3.9.11-amazoncorretto-24-al2023
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/target/primenumbers-0.0.1-SNAPSHOT.jar"]
