package mrchenproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.org.event.SendNotifyEvent;
import com.chen.org.event.SendNotifyListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/event/application-event.xml"})

public class EventTest {
	
	@Autowired  
    private SendNotifyListener send;  
	
	@Test
	public  void test() throws IOException, InterruptedException  {
//		 applicationContext.publishEvent(new SendNotifyEvent("今年是龙年的博客更新了"));  
		send.run();
//		 Thread.sleep(1000l);
		 System.out.println(11111);
	}

}
