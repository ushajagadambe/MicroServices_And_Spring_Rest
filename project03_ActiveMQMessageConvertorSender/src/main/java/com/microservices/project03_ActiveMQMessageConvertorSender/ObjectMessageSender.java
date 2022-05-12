package com.microservices.project03_ActiveMQMessageConvertorSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ObjectMessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Scheduled(cron = "0/20 * * * * *")
    public  void sendMessage()
    {
        Employee employee=new Employee(1l,"krishna");
        jmsTemplate.convertAndSend("activemq3",employee);
        System.out.println("message send");
    }
}
