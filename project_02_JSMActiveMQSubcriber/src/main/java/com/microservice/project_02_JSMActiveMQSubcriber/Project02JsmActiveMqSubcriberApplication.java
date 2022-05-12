package com.microservice.project_02_JSMActiveMQSubcriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Project02JsmActiveMqSubcriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project02JsmActiveMqSubcriberApplication.class, args);
	}

}
