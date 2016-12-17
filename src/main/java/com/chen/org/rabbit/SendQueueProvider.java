package com.chen.org.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="sendQueueProvider")
public class SendQueueProvider {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	public void send(){
		
		rabbitTemplate.convertAndSend("message.test", "successful");
		
	}
	
}
