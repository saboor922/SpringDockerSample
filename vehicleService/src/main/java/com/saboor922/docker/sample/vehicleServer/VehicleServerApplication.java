package com.saboor922.docker.sample.vehicleServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VehicleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleServerApplication.class, args);
    }
}
