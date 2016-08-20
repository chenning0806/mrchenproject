package com.chen.org.event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SendNotifyListener implements ApplicationListener<SendNotifyEvent>{
	
	@Autowired  
    private ApplicationContext applicationContext;  
	public void run(){
		applicationContext.publishEvent(new SendNotifyEvent("今年是龙年的博客更新了"));  
	}
	
	@Async
    @Override
    public void onApplicationEvent(SendNotifyEvent sendNotifyEvent) {
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
        System.out.println("发送通知监听启动..." + sendNotifyEvent.getSource());
    }
}
