package mrchenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.New;

public class NIOTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fileInputStream  = new FileInputStream(new File("/Users/ChenNing/Desktop/school.sh"));
		FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/ChenNing/Desktop/school2.sh"));
		FileChannel channel = fileInputStream.getChannel();
		FileChannel channel2 = fileOutputStream.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(10);
		
		while(channel.read(buffer)!=-1){
			System.out.print(  new String(buffer.array()) );
			buffer.flip();
			channel2.write(buffer);
			buffer.clear();
		}
		channel.close();
		channel2.close();
		fileInputStream.close();
		fileOutputStream.close();
	}


}
