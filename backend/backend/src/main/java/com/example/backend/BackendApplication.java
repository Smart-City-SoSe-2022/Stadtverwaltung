package com.example.backend;

import net.bytebuddy.build.BuildLogger;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

//	public String hello(){
//		return "Hello";
//	}
//	@Bean
//	public Queue helloQueue(){
//		return new Queue("hello");
//	}
//
//
//	@Autowired
//	private RabbitTemplate rabbitTemplate;
//
//
//	@Scheduled(fixedDelay = 5000)
//	public void pushMessage() {
//		String messageString = "Hello Rabbit @" + LocalDateTime.now().format(DateTimeFormatter.ISO_TIME);
//		rabbitTemplate.convertAndSend("hello", messageString);
//	}
////	@RabbitListener(queues = "hello")
////	public void getString(String message) {
////		logger.warn("From Queue : {}" + message);
////	}


}
