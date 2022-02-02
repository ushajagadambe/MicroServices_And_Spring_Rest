package com.microserice.project_03_ShoppingService_Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private ShoppingConsumerServiceHelper shoppingConsumerServiceHelper;
    @GetMapping("/details")
    public String getShoppingDetails()
    {
        return "successfully shopping"+shoppingConsumerServiceHelper.getInfo();
    }
}
