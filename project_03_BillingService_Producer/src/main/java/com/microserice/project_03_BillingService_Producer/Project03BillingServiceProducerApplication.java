package com.microserice.project_03_BillingService_Producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project03BillingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project03BillingServiceProducerApplication.class, args);
	}

}
