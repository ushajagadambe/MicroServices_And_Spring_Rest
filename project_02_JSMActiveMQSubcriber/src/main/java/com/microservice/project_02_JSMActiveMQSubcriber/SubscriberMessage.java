package com.microservice.project_02_JSMActiveMQSubcriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberMessage {
    @JmsListener(destination = "topic1")
    public String  readMessage(String text)
    {
       return text;
    }
}
