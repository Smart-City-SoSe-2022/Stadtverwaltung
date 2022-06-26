package com.example.backend.rabbitmq.service;


import com.example.backend.customer.CustomerEntity;
import com.example.backend.customer.CustomerRepository;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PortalNewAcc implements MessageListener {
    private CustomerRepository customerRepository;

    public PortalNewAcc(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "stadtverwaltung",durable = ""),
            exchange = @Exchange(value = "microservice.eventbus",type = "topic",durable = ""),key = "portal.account.created"
    )
    )
    @Override
    public void onMessage(Message message) {
        String data = new String(message.getBody());
        JSONParser parser = new JSONParser();
        JSONObject neu;
        try{
            neu = (JSONObject) parser.parse(data);
        } catch(ParseException e){
            throw new RuntimeException(e);
        }
        customerRepository.saveAndFlush(new CustomerEntity(neu.getAsNumber("id").longValue()));
      }

}
