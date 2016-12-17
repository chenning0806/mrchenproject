package quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/quartz/quartz.xml"})
public class quartz {
	

	@Test
	public void rabbitTest() throws InterruptedException {
		System.out.println("start");
		Thread.sleep(60000l);

	}
}
