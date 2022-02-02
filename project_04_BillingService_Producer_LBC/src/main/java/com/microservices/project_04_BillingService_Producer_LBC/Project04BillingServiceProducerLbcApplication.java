package com.microservices.project_04_BillingService_Producer_LBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Project04BillingServiceProducerLbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project04BillingServiceProducerLbcApplication.class, args);
	}

}
