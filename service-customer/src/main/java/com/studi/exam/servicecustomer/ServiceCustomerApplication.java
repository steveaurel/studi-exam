package com.studi.exam.servicecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("com.studi.exam.core.customer")
@EnableDiscoveryClient
public class ServiceCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCustomerApplication.class, args);
    }

}
