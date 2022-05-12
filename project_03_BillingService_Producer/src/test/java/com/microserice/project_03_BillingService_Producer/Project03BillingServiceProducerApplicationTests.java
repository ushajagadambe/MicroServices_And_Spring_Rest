package com.microserice.project_03_BillingService_Producer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project03BillingServiceProducerApplicationTests {

	@BeforeEach
	public  void before()
	{
		System.out.println("before ");
	}
	@Test
	void contextLoads() {

		System.out.println("test excuted");

	}

}
