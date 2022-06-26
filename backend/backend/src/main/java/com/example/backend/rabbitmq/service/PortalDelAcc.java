package com.example.backend.rabbitmq.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PortalDelAcc implements MessageListener {
    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "stadtverwaltung",durable = ""),
            exchange = @Exchange(value = "microservice.eventbus",type = "topic",durable = ""),key = "portal.account.deleted"
    )
    )

    @Override
    public void onMessage(Message message){
        System.out.println(new String (message.getBody()));
    }
}


