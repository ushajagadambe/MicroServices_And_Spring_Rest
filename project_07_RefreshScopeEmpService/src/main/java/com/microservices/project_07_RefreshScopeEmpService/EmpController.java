package com.microservices.project_07_RefreshScopeEmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/empcontroller")
public class EmpController {

    @Value("${dbuser}")
    private  String userName;
    @Value("${dbpassword}")
    private  String password;
    @GetMapping("/details")
    public String getDetails()
    {
        return "emp  database detail"+"________________"+userName+"_______________"+password;
    }

}
