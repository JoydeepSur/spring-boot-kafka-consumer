package com.example.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.consumer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void stringConsumer(String str) {
		System.out.println("Consumed String Message :"+ str);
	}
	
	@KafkaListener(topics = "Kafka_Example_Json", groupId = "group_json", containerFactory = "userConcurrentKafkaListenerContainerFactory")
	public void jsonConsume(User user) {
		System.out.println("Consumed JSON Message :"+ user);
	}
}
