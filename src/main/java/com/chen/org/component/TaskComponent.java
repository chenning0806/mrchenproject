package com.chen.org.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class TaskComponent {
    @Scheduled(cron= "0/5 * * * * * ")
	public void task(){
		System.out.println("quartz start...");
	}
}
