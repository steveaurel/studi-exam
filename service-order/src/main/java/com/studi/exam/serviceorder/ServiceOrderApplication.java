package com.studi.exam.serviceorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan("com.studi.exam.core.order")
@EnableDiscoveryClient
public class ServiceOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOrderApplication.class, args);
	}

}
