package com.example.backend.rabbitmq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/.env")
public class ApplicationConfig {

}
