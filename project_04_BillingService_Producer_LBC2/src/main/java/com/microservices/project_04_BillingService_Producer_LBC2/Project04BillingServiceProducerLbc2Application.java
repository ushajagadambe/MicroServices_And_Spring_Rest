package com.microservices.project_04_BillingService_Producer_LBC2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project04BillingServiceProducerLbc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project04BillingServiceProducerLbc2Application.class, args);
	}

}
