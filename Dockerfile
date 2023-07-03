FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /target/ci-cd-test-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#docker build -t seregapatyukov/ci-cd-test .
#docker run -p 8080:8080 seregapatyukov/ci-cd-test