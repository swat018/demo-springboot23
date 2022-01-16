FROM openjdk:11.0.8-jdk-slim AS builder
WORKDIR source
ARG JAR_FILE=target/demo*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar demo-springboot23-0.0.1-SNAPSHOT.jar extract

FROM openjdk:11.0.8-jre-slim
WORKDIR application
COPY --from=builder source/dependencies/ ./
COPY --from=builder source/spring-boot-loader/ ./
COPY --from=builder source/snapshot-dependencies/ ./
COPY --from=builder source/application/ ./

ENTRYPOINT ["java","org.sprigframework.boot.loader.JarLauncher"]