package mrchenproject;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Timer;
import java.util.TimerTask;

public class Nullpoint {
   static int  i = 1;
 
	public static void main(String[] args) throws Exception{
	
		File file = new File("students.xls");
		System.out.println(file.getCanonicalPath());//获取标准的路径 
	    System.out.println(file.getAbsolutePath());//获取绝对路径
		file.createNewFile();
}
}