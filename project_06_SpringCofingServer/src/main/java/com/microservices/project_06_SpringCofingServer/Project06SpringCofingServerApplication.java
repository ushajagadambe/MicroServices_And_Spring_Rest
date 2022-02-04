package com.microservices.project_06_SpringCofingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Project06SpringCofingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project06SpringCofingServerApplication.class, args);
	}

}
