FROM maven:alpine
MAINTAINER saboor922 <abdussaboor2002@hotmail.com>
COPY configService /opt/config-service/
COPY /config /config
WORKDIR /opt/config-service/
RUN mvn clean package
WORKDIR /
ENTRYPOINT ["java", "-jar",\
            "/opt/config-service/target/Config-Service-0.0.1.jar",\
            "--server.port=9000",\
            "--spring.config.name=configService",\
            "--spring.cloud.config.server.native.search-locations=/config",\
            "--spring.profiles.active=native",\
            "--management.endpoints.web.exposure.include=*"]
EXPOSE 9000
