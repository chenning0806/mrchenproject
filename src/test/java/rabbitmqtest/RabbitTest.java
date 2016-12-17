package rabbitmqtest;

import com.chen.org.rabbit.SendQueueProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/rabbit/application-rabbitmq.xml"})
public class RabbitTest {
	
	@Autowired
	private SendQueueProvider sendQueueProvider;
	@Test
	public void rabbitTest(){

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
