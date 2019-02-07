FROM maven:alpine
MAINTAINER saboor922 <abdussaboor2002@hotmail.com>
COPY randomRestService /opt/random-rest-service/
WORKDIR /opt/random-rest-service/
RUN mvn clean package
WORKDIR /
ENTRYPOINT ["java", "-jar",\
            "/opt/random-rest-service/target/Random-Rest-Service-0.0.1.jar",\
            "--server.port=8081",\
            "--spring.application.name=randomRestService",\
            "--spring.cloud.config.uri=http://localhost:9000",\
            "--spring.profiles.active=development",\
            "--eureka.client.serviceUrl.defaultZone:http://localhost:9001/eureka"]
EXPOSE 8081
