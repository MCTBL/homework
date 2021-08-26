package socketchat;

import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
//		byte i[] = new byte[10];
		
		Socket s=new Socket("127.0.0.1",9999);
		
//		BufferedInputStream x=new BufferedInputStream(s.getInputStream());
//		x.read(i);
//		System.out.println(i);
		
		Receive r=new Receive(s);
		Send se=new Send(s);

		r.start();
		se.start();

	}
}