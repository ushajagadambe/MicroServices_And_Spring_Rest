package com.microservice.projcet_01_JSMActiveMQSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.Date;

@Component
public class SenderApplication implements CommandLineRunner {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.send("ActiveMQ1", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("ActiveMQ1 message send by sender"+new Date());
            }
        });
        System.out.println("message sent");
    }
}
