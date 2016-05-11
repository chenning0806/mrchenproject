package mrchenproject;

import java.text.SimpleDateFormat;

public class Dhbtime {
	 public static void main(String[] args) {
	        doTime(System.currentTimeMillis());
	    }


	    private static void doTime(Long time) {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
	        SimpleDateFormat check = new SimpleDateFormat("HHmmssSSS");
	        String sd = "";
	        while (true) {
	            sd = check.format(time);
	            if (sd.equals("235959999")) { //当天最后一毫秒 打断
	                System.out.print("final time = " + sdf.format(time));
	                break;
	            } else {
	                time++;
	                System.out.println(sd);
	            }
	        }

	    }
}
