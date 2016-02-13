package mrchenproject;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class IoTestClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 11234);
			OutputStream o = socket.getOutputStream();
			o.write("sss".getBytes());
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
