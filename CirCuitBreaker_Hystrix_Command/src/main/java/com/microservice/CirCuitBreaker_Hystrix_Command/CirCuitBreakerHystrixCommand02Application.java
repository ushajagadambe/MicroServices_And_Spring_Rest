package com.microservice.CirCuitBreaker_Hystrix_Command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class CirCuitBreakerHystrixCommand02Application {

	public static void main(String[] args) {
		SpringApplication.run(CirCuitBreakerHystrixCommand02Application.class, args);
	}

}
