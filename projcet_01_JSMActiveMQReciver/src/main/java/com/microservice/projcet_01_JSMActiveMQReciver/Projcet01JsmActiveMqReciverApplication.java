package com.microservice.projcet_01_JSMActiveMQReciver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Projcet01JsmActiveMqReciverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Projcet01JsmActiveMqReciverApplication.class, args);
	}

}
