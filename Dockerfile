FROM maven:3.9.3-amazoncorretto-17
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/target/primenumbers-0.0.1-SNAPSHOT.jar"]