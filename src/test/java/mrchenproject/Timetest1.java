package mrchenproject;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.client.methods.HttpGet;
import org.junit.Test;

public class Timetest1 {
//@Test
public void test(){
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmssSSS");
    Date date = new Date();
    int hmsS = Integer.parseInt(simpleDateFormat.format(date));
    String strr = hmsS+"";
    String str = "66161420160413"+hmsS;
    String ssSSS = strr.substring(strr.length()-5, strr.length());
    String hh = strr.substring(0,2);
    String mm = strr.substring(2,4);
    hh = "23";
    mm = "58";
    ssSSS = "59999";
    while(true){
    	if(!"59999".equals(ssSSS)){
//    		HttpGet httpget = new HttpGet(url);  
//    		body = send(httpget, str);
//    		System.out.println(str);
    		int ss = Integer.parseInt(ssSSS);
    		ss++;
    		if(ss<10){
    			ssSSS="0000"+ss;
    		}else if(ss<100){
    			ssSSS="000"+ss;
    		}else if(ss<1000){
    			ssSSS="00"+ss;
    		}else if(ss<10000){
    			ssSSS="0"+ss;
    		}else{
    			ssSSS=ss+"";
    		}
        	str = "66161420160413"+hh+mm+ssSSS;
    	}else{
    		if("23".equals(hh)&&"59".equals(mm)&&"59999".equals(ssSSS)){
    			System.out.println(str);
    			break;
    		}
    		str = "66161420160413"+hh+mm+ssSSS;
//    		HttpGet httpget = new HttpGet(url);  
//    		body = send(httpget, str);
//    		System.out.println(str);
    		ssSSS="00000";
    		if(!"59".equals(mm)){
    			int mmm = Integer.parseInt(mm);
    			mmm++;
    			if(mmm<10){
    				mm="0"+mmm;
    			}else{
    				mm=mmm+"";
    			}
    			str = "66161420160413"+hh+mm+ssSSS;
    		}else{
    			str = "66161420160413"+hh+mm+ssSSS;
    			
//    			body = send(httpget, str);
//    			System.out.println(str);
    			mm="00";
    			if(!"23".equals(hh)){
        			int hhh = Integer.parseInt(hh);
        			hhh++;
        			if(hhh<10){
        				hh="0"+hhh;
        			}else{
        				hh=hhh+"";
        			}
        			str = "66161420160413"+hh+mm+ssSSS;
        		}
    		}
    	}
//    	if(body.equals("yes")){
//    		break;
//    	}
    }
}
}
