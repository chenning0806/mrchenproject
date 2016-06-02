package mrchenproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileWriterTest {

	public static void main(String[] args) throws Exception{

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("/Users/ChenNing/Downloads/noten.txt"), true));
		bufferedWriter.write("asd3\r\n");
		bufferedWriter.write("asd4\r\n");
		bufferedWriter.close();
		
	}

}
