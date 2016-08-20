package mrchenproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.Socket;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.naming.AuthenticationException;

public class ExtendsTest {
	static int i ;
	static String string;
	public static void main(String[] args) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		System.out.println("1".compareTo(sdf.format(new Date(0l))));
		String a1 = "123";
		String a2 = "123";
		String a3 = new String("123");
		String a4 = new String("123");
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a3==a4);
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "A");
	
	}
}
