package mrchenproject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertise {

	public static void main(String[] args) {
		

		try {
			InputStream inStream = ReadPropertise.class.getResourceAsStream("/config/log4j.properties");
			Properties properties = new Properties();
			properties.load(inStream);
			String string = properties.getProperty("log4j.rootLogger");
			System.out.println(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
