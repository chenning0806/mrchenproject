package rabbitmqtest;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.org.rabbit.SendQueueProvider;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/rabbit/application-rabbitmq.xml"})
public class RabbitTest {
	
	@Autowired
	private SendQueueProvider sendQueueProvider;
	@Test
	public void rabbitTest(){
		
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			@Override
//			public void run() {
//				
//			}
//		}, 0, 1000);
		while(true){
			try {
				Thread.sleep(1000);
				sendQueueProvider.send();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
