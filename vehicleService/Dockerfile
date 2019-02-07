FROM maven:alpine
MAINTAINER saboor922 <abdussaboor2002@hotmail.com>
COPY vehicleService /opt/vehicle-service/
WORKDIR /opt/vehicle-service/
RUN mvn clean package
WORKDIR /
ENTRYPOINT ["java", "-jar",\
            "/opt/vehicle-service/target/Vehicle-Service-0.0.1.jar",\
            "--server.port=8082",\
            "--spring.application.name=vehicleService",\
            "--spring.cloud.config.uri=http://localhost:9000",\
            "--spring.profiles.active=development",\
            "--eureka.client.serviceUrl.defaultZone:http://localhost:9001/eureka"]
EXPOSE 8082
