package com.microservices.project_06_ConstumerService_SCE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project06ConstumerServiceSceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project06ConstumerServiceSceApplication.class, args);
	}

}
