FROM maven:alpine
MAINTAINER saboor922 <abdussaboor2002@hotmail.com>
COPY discoveryService /opt/discovery-service/
WORKDIR /opt/discovery-service/
RUN mvn clean package
WORKDIR /
ENTRYPOINT ["java", "-jar",\
            "/opt/discovery-service/target/Discovery-Service-0.0.1.jar",\
            "--server.port=9001",\
            "--spring.config.name=discoveryService",\
            "--eureka.client.serviceUrl.defaultZone:http://localhost:9001/",\
            "--spring.profiles.active=development",\
            "--spring.cloud.config.uri=http://config-service:9000",\
            "--management.endpoints.web.exposure.include=*"]
EXPOSE 9001
