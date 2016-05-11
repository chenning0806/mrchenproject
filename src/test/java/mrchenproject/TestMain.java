package mrchenproject;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestMain {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			int k = 1000;
			@Override
			public void run() {
					while(k!=0) {
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (TestMain.class) {
							if(k==0){
								break;
							}
							k--;
							System.out.println(Thread.currentThread().getName()+"号窗口已售票，当前剩余票数："+k+"张。");
						}
					}
				}
			
		};
		
		new Thread(runnable,"A").start();
		new Thread(runnable,"B").start();
		new Thread(runnable,"C").start();
		new Thread(runnable,"D").start();
		new Thread(runnable,"E").start();
		new Thread(runnable,"F").start();
		new Thread(runnable,"G").start();
		new Thread(runnable,"H").start();
//		
//		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
//	    scheduledThreadPool.scheduleAtFixedRate(new Runnable() {  
//		    public void run() {  
//			    System.out.println(Thread.currentThread().getName()+"delay 3 seconds");  
//		    }  
//	    },1, 3, TimeUnit.SECONDS);  
	}

}
