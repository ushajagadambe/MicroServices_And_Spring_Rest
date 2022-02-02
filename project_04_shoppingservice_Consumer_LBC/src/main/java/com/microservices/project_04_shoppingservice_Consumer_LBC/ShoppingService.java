package com.microservices.project_04_shoppingservice_Consumer_LBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingService {

    @Autowired
    public ConsumerHelperClass consumerHelperClass;
    @GetMapping("/shoppingdetails")
    public String getShoppingDetails()
    {
        return "shopping successfully"+"................."+consumerHelperClass.getDetailsOfConsumer();
    }
}
