package com.microservice.circuitBreaker_Hystrixdahsboard_02;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/circuit")
public class CircuitBreaker {
    int count;
    @GetMapping("/details")
    @HystrixCommand(fallbackMethod = "fallBackMethod",
    commandProperties = {
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="10000")
    })
    public String getDetails()
    {
        count++;
        System.out.println("details method"+"---------"+count);
        if(new Random().nextInt(11)<9)
            throw  new RuntimeException("runtime exception");
        return "successfully ";
    }

    public String fallBackMethod()
    {
      return   "please try again";
    }
}
