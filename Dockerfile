FROM openjdk:8-jdk-alpine
RUN mkdir /app
WORKDIR /app
RUN pwd
COPY pom.xml mvnw ./
COPY .mvn ./.mvn
RUN ls -l ./
RUN ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw package
RUN ls -l /app/target
ARG JAR_FILE=target/*.jar
RUN mv ${JAR_FILE} ./app.jar
RUN ls -l /app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
# java -jar app.jar
# java -jar target/prueba_juan-0.0.1-SNAPSHOT.jar
# docker image prune
# docker image ls