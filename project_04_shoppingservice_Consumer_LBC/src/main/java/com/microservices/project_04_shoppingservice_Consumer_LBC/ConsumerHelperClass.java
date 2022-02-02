package com.microservices.project_04_shoppingservice_Consumer_LBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerHelperClass {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    public String getDetailsOfConsumer()
    {
      ServiceInstance serviceInstance= loadBalancerClient.choose("billing-service");
      String url=serviceInstance.getUri()+"/billing"+"/info";
        RestTemplate restTemplate=new RestTemplate();
       String reponse= restTemplate.getForObject(url,String.class);
       return  reponse;
    }

}
