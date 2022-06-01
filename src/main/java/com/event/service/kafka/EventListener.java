package com.event.service.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.event.service.model.Event;

@Service
public class EventListener {
	
	static final Logger logger  = LogManager.getLogger(EventListener.class.getName());
	
	@KafkaListener(topics = "sharat-test-1", groupId = "group_json", containerFactory = "eventKafkaListenerFactory")
	public void consumeJson(Event event) {
		
		logger.info("HostName is : " +event.getHostname() +  "and  Id is : " +event.getId());
	}
}
