package com.microserice.project_03_BillingService_Producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
    @GetMapping("/details")
    public  String getBillingDetails()
    {
       return  "we accepts all types of card";
    }
}
