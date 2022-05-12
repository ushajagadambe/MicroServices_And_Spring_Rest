package com.microservices.project03_ActiveMQMessageConvertorReceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Project03ActiveMqMessageConvertorReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project03ActiveMqMessageConvertorReceiverApplication.class, args);
	}

}
