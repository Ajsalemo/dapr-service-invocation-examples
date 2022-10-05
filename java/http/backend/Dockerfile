FROM maven:3.8.6 as build
WORKDIR /app
COPY . /app
RUN mvn -f /app/pom.xml clean package

FROM adoptopenjdk/openjdk11:jdk-11.0.16_8
COPY --from=build /app/target/http-0.0.1-SNAPSHOT.jar /app/http-0.0.1-SNAPSHOT.jar
    
EXPOSE 8080
CMD [ "java", "-jar", "/app/http-0.0.1-SNAPSHOT.jar" ]