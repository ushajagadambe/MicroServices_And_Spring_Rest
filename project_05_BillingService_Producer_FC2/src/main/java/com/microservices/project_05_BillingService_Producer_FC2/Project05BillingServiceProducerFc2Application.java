package com.microservices.project_05_BillingService_Producer_FC2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project05BillingServiceProducerFc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project05BillingServiceProducerFc2Application.class, args);
	}

}
