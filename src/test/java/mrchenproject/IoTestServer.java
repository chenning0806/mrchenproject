package mrchenproject;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IoTestServer {

	public static void main(String[] args) {
		ServerSocket socket;
		try {
			socket = new ServerSocket(11234);
			Socket  s = socket.accept();
			InputStream ss = s.getInputStream();
			int len = 0;
			byte[] b = new byte[1024];
			while((len=ss.read(b))!=-1){
				String string = new String(b);
				System.out.println(string);
			}
			s.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
