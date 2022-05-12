package com.microservice.project_02_JSMActiveMQPushlisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Project02JsmActiveMqPushlisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project02JsmActiveMqPushlisherApplication.class, args);
	}

}
