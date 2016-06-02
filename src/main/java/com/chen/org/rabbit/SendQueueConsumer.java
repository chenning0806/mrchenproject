package com.chen.org.rabbit;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component(value="sendQueueConsumer")
public class SendQueueConsumer implements MessageListener{
	@Override
	public void onMessage(final Message arg0) {
		
				System.out.println(new String(arg0.getBody())+"------"+Thread.currentThread().getName());
				
	}
}
