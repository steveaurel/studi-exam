package com.studi.serviceproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("com.studi.exam.core.product")
@EnableDiscoveryClient
public class ServiceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProductApplication.class, args);
	}

}
