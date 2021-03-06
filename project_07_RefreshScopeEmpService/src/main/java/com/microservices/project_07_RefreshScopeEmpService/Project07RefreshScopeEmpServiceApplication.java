package com.microservices.project_07_RefreshScopeEmpService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project07RefreshScopeEmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project07RefreshScopeEmpServiceApplication.class, args);
	}

}
