package com.saboor922.randomRestServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RandomRestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomRestServerApplication.class, args);
    }

}

