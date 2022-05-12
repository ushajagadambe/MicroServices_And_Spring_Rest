package com.microservices.project03_ActiveMQMessageConvertorReceiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ObjectReceiver {
    @Autowired
    private JmsTemplate jmsTemplate;
    @JmsListener(destination = "activemq3")
    public void  readMessage(Employee employee)
    {
        System.out.println(employee);
    }
}
