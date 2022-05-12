package com.microservices.project03_ActiveMQMessageConvertorSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
@EnableScheduling
public class Project03ActiveMqMessageConvertorSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project03ActiveMqMessageConvertorSenderApplication.class, args);
	}

}
