package com.microservices.project_06_ConstumerService_SCE;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/constumer")
public class ConstumerController {
    @Value("${dbuser}")
    private  String userName;

    @Value("${dbpassword}")
    private  String password;

    @GetMapping("/info")
    public String getInfo()
    {
        return  "constumer info with database"+userName+password;
    }
}
