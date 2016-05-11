package mrchenproject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.chen.org.bean.OrderParam;

public class GetUrl {
	private static HttpClient httpClient = new DefaultHttpClient();  
	private static String string;
	private static int i =1;
	public static void main(String[] args) {
	
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				string= GetUrl.get("http://vip1.917ka.com/Ajax/GetCardList/");
//				OrderParam list = JSON.parseObject(string, OrderParam.class);
//				if(!list.getMsg().equals("订单号不存在"))
//				System.out.println(list.getMsg());
//				
//			}
//		},1000,1);
		GetUrl.get("http://vip1.917ka.com/Ajax/GetCardList/");
	}

    
  
    /**  
     * 发送Get请求  
     * @param url  
     * @param params  
     * @return  
     */  
    public static String get(String url) {  
        String body = null;  
        try {  
            // Get请求  
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
	        SimpleDateFormat check = new SimpleDateFormat("HHmmssSSS");
	        String sd = "66161420160413";
	        long time = System.currentTimeMillis();
	        
	        while (true) {
	        	HttpGet httpget = new HttpGet(url);  
	            sd += check.format(time);
	            if (sd.equals("235959999")) { //当天最后一毫秒 打断
	                System.out.print("final time = " + sdf.format(time));
	                break;
	            } else {
	            	body = send(httpget, sd);
	            	if(body.equals("yes")){
	            		break;
	            	}
	                time++;
	                sd = "66161420160413";
	            }
	        }
            // 设置参数  
            //yyyyMMddHHmmssSSS
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmssSSS");
//            Date date = new Date();
//            int hmsS = Integer.parseInt(simpleDateFormat.format(date));
//            String strr = hmsS+"";
//            String str = "66161420160413"+hmsS;
//            String ssSSS = strr.substring(strr.length()-5, strr.length());
//            String hh = strr.substring(0,2);
//            String mm = strr.substring(2,4);
//            while(true){
//            	if(!"59999".equals(ssSSS)){
//            		HttpGet httpget = new HttpGet(url);  
//            		body = send(httpget, str);
////            		System.out.println(str);
//            		int ss = Integer.parseInt(ssSSS);
//            		ss++;
//            		if(ss<10){
//            			ssSSS="0000"+ss;
//            		}else if(ss<100){
//            			ssSSS="000"+ss;
//            		}else if(ss<1000){
//            			ssSSS="00"+ss;
//            		}else if(ss<10000){
//            			ssSSS="0"+ss;
//            		}else{
//            			ssSSS=ss+"";
//            		}
//	            	str = "66161420160413"+hh+mm+ssSSS;
//            	}else{
//            		if("23".equals(hh)&&"59".equals(mm)&&"59999".equals(ssSSS)){
//            			System.out.println(str);
//            			break;
//            		}
//            		str = "66161420160413"+hh+mm+ssSSS;
//            		HttpGet httpget = new HttpGet(url);  
//            		body = send(httpget, str);
////            		System.out.println(str);
//            		ssSSS="00000";
//            		if(!"59".equals(mm)){
//            			int mmm = Integer.parseInt(mm);
//            			mmm++;
//            			if(mmm<10){
//            				mm="0"+mmm;
//            			}else{
//            				mm=mmm+"";
//            			}
//            			str = "66161420160413"+hh+mm+ssSSS;
//            		}else{
//            			str = "66161420160413"+hh+mm+ssSSS;
//            			
//            			body = send(httpget, str);
////            			System.out.println(str);
//            			mm="00";
//            			if(!"23".equals(hh)){
//                			int hhh = Integer.parseInt(hh);
//                			hhh++;
//                			if(hhh<10){
//                				hh="0"+hhh;
//                			}else{
//                				hh=hhh+"";
//                			}
//                			str = "66161420160413"+hh+mm+ssSSS;
//                		}
//            		}
//            	}
//            	if(body.equals("yes")){
//            		break;
//            	}
//            }
//            
	           
            
//            if (entity != null) {  
//                entity.consumeContent();  
//            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }   
        return body;  
    }



	private static String send(HttpGet httpget, String str)
			throws URISyntaxException, IOException, ClientProtocolException {
		String body;
		System.out.println(str);
		httpget.setURI(new URI(httpget.getURI().toString()  + str));  
		// 发送请求  
		HttpResponse httpresponse = httpClient.execute(httpget);  
		// 获取返回数据  
		HttpEntity entity = httpresponse.getEntity();  
		body = EntityUtils.toString(entity);  
		
		OrderParam list = JSON.parseObject(body, OrderParam.class);
		
		if(!list.getMsg().equals("订单号不存在")){
			System.out.println(body);
			System.out.println(list.getMsg());
			body="yes";
		}
		return body;
	}  
}
