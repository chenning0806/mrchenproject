package mrchenproject;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;



public class Await {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println(111);
//				try {
//					
//					System.out.println(Thread.currentThread().getName());
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}, 1000, TimeUnit.MILLISECONDS.toMillis(1000));
//		System.out.println(222);
//	}

		System.out.println(123);
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		}).start();
		 System.out.println(1233);
		 System.exit(1);
	}	
}
