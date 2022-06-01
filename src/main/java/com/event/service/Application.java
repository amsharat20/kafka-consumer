package com.event.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
@ComponentScan(basePackages ="com.event.service")
public class Application {

	static final Logger logger  = LogManager.getLogger(Application.class.getName());

	public static void main(String[] args) {
		logger.info("Kafka Consumer");
		SpringApplication.run(Application.class, args);
	}
}
