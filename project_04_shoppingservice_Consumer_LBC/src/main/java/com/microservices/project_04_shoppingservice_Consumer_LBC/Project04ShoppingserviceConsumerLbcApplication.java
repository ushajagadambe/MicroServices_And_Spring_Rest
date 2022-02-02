package com.microservices.project_04_shoppingservice_Consumer_LBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project04ShoppingserviceConsumerLbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project04ShoppingserviceConsumerLbcApplication.class, args);
	}

}
