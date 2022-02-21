package com.microservice.CirCuitBreaker_Hystrix_Command;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/circuit")
public class CircuitController {
    int count=0;
    @GetMapping("/details")
    @HystrixCommand(fallbackMethod = "fallBackMethod",
    commandProperties = {
@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="10000"),
    })
    public String getDetails()
    {
        count++;
        System.out.println("details method"+"---------"+count);
        if(new Random().nextInt(9)<9)
            throw  new RuntimeException("runtime exception");
        return "successfully ";
    }
    public String fallBackMethod()
    {
        System.out.println("fallback method");
        return "please try after sometime";
    }
}
