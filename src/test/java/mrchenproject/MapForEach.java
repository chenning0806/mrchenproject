package mrchenproject;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		String string = "(3)班（七年级(3)班）";
		String ss;
		try {
			ss = URLDecoder.decode(string,"UTF-8");
			System.out.println(ss);
			System.out.println(URLDecoder.decode(ss,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
