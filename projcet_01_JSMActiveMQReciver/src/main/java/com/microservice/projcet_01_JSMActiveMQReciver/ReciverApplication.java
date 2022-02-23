package com.microservice.projcet_01_JSMActiveMQReciver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReciverApplication {
    @JmsListener(destination = "ActiveMQ1")
    public void readMessage(String txt)
    {
    System.out.println("recivedMesage"+txt);
    }
}
