package com.microservices.project_05_ShoppingService_Client_FC;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("billing-service")
public interface IConsumerHelperClass {
    @GetMapping("/billing/billinginfo")
    public String getBillingDetails();
}
