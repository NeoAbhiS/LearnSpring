FROM openjdk:16
RUN mkdir /app
COPY target/learnSpring-0.0.1-SNAPSHOT.jar /app/SpringApp.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","SpringApp.jar"]
