package com.microservices.project_07_RefreshScopeSpringConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Project07RefreshScopeSpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project07RefreshScopeSpringConfigServerApplication.class, args);
	}

}
