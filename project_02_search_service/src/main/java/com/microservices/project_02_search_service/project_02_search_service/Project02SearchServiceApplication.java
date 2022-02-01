package com.microservices.project_02_search_service.project_02_search_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project02SearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project02SearchServiceApplication.class, args);
	}

}
