package com.microservices.project_04_BillingService_Producer_LBC;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Value("${server.port}")
    private  String port;

    @Value("${eureka.instance.instance-id}")
    private  String instanceId;
    @GetMapping("/info")
    public String getBillingDetails()
    {
        return "we accept all type of atm cards"+port+instanceId;
    }
}
