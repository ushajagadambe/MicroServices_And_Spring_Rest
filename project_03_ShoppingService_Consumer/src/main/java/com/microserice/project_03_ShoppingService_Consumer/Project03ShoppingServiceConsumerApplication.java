package com.microserice.project_03_ShoppingService_Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project03ShoppingServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project03ShoppingServiceConsumerApplication.class, args);
	}

}
