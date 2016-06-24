package mrchenproject;

import java.util.Timer;
import java.util.TimerTask;

public class Nullpoint {
   static int  i = 1;
 
	public static void main(String[] args) {
	
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(111);
			}
		}, 1000,1000);
}
}