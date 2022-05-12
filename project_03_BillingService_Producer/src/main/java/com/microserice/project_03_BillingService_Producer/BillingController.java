package com.microserice.project_03_BillingService_Producer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
    @GetMapping("/details")
    public ResponseEntity<Billing> getBillingDetails()
    {
        Billing billing=new Billing();
        billing.setBill_id("abc");
       return  new ResponseEntity<>(billing,HttpStatus.OK);
    }
}
