package com.microservice.projcet_01_JSMActiveMQSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Projcet01JsmActiveMqSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Projcet01JsmActiveMqSenderApplication.class, args);
	}

}
