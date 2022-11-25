package com.example.estoreapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EstoreApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstoreApiGatewayApplication.class, args);
    }

}
