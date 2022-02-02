package com.microservices.project_05_BillingService_Producer_FC;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Value("${server.port}")
    private  String serverPort;

    @Value("${eureka.instance.instance-id}")
    private  String instanceId;
    @GetMapping("/billinginfo")
    public String getBillingDetails()
    {
        return "we accept all cards"+serverPort+instanceId;
    }
}
