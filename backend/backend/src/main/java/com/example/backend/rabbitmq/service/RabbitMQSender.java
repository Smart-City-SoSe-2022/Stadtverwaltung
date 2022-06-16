package com.example.backend.rabbitmq.service;

import com.example.backend.rabbitmq.Club;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("microservice.eventbus")
    private String exchange;

    @Value("anonymous.info")
    private String routingkey;

    public void send(Club club){
        rabbitTemplate.convertAndSend(exchange,routingkey,club);
        System.out.println("send msg =" + club);
    }
}
