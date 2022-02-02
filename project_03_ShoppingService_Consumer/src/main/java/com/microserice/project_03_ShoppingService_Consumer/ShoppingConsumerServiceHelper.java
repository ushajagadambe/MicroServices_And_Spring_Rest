package com.microserice.project_03_ShoppingService_Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ShoppingConsumerServiceHelper {
    @Autowired
    private DiscoveryClient discoveryClient;

    public String getInfo()
    {
       List<ServiceInstance> serviceInstanceList= discoveryClient.getInstances("billing-Service");
      ServiceInstance serviceInstance= serviceInstanceList.get(0);
      String url=serviceInstance.getUri()+"/billing"+"/details";
        RestTemplate restTemplate=new RestTemplate();
       String reponse= restTemplate.getForObject(url,String.class);
       return  reponse;
    }
}
