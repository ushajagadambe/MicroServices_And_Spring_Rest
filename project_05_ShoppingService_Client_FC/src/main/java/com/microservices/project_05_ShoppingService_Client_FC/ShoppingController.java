package com.microservices.project_05_ShoppingService_Client_FC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private IConsumerHelperClass consumerHelperClass;
    @GetMapping("/shoppingdetails")
    public String getShoppingService()
    {
        return "shopping done successful"+consumerHelperClass.getBillingDetails();
    }
}
