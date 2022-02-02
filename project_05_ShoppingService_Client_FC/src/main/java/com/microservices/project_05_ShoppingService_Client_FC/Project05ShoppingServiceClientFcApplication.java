package com.microservices.project_05_ShoppingService_Client_FC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Project05ShoppingServiceClientFcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project05ShoppingServiceClientFcApplication.class, args);
	}

}
