package com.app.end_user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
@SpringBootApplication
public class EndUserApplication {

	@KafkaListener(topics = "user-topic", groupId = "group-1")
	public void printMessage(String message){
		log.info(message);
	}

	public static void main(String[] args) {
		SpringApplication.run(EndUserApplication.class, args);
	}

}
