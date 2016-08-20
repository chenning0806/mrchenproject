package com.chen.org.event;

import org.springframework.context.ApplicationEvent;

public class SendNotifyEvent extends ApplicationEvent {

	public SendNotifyEvent(Object source) {
		super(source);
	}

}
