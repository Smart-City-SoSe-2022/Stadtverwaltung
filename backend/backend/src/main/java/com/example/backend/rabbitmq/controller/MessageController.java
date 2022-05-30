package com.example.backend.rabbitmq.controller;

import com.example.backend.rabbitmq.Club;
import com.example.backend.rabbitmq.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/backend-rabbitmq/")
public class MessageController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping(value ="/producer")
    public String producer(@RequestParam("clubEmp") String clubName,@RequestParam("clubID") String clubID){
        Club club = new Club();
        club.setClubID(clubID);
        club.setClubName(clubName);
        rabbitMQSender.send(club);

        return "Message sent succesfully";
    }

}
