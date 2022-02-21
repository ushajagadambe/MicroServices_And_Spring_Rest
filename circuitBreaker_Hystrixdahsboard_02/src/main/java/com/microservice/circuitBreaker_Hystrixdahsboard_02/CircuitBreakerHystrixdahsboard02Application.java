package com.microservice.circuitBreaker_Hystrixdahsboard_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class CircuitBreakerHystrixdahsboard02Application {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerHystrixdahsboard02Application.class, args);
	}

}
