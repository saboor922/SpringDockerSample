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
            "--spring.cloud.config.uri=http://config-service:9000",\
            "--spring.profiles.active=development",\
            "--eureka.client.serviceUrl.defaultZone:http://discovery-service:9001/eureka",\
            "--server.servlet.context-path=/api",\
            "--spring.data.mongodb.host=vehicle-mongodb",\
            "--spring.data.mongodb.port=27017",\
            "--spring.data.mongodb.database=vehicle",\
            "--management.endpoints.web.exposure.include=*"]
EXPOSE 8082
