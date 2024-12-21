package com.app.delivery_boy;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class DeliveryBoyApplication {

	@Bean
	public NewTopic getNewTopic(){
		return TopicBuilder.name("user-topic").build();
	}

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBoyApplication.class, args);
	}

}
