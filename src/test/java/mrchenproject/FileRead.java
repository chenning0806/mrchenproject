package mrchenproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileRead {

	public static void main(String[] args) throws Exception {

         File file=new File("/Users/ChenNing/Downloads/en.txt");
         if(file.isFile() && file.exists()){ //判断文件是否存在
             InputStreamReader read = new InputStreamReader(
             new FileInputStream(file));
             BufferedReader bufferedReader = new BufferedReader(read);
             String lineTxt = null;
             while((lineTxt = bufferedReader.readLine()) != null){
                 System.out.println(lineTxt.replace(" ", "+"));
             }
             read.close();
		
         }
	}
}
