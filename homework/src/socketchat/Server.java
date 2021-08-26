package socketchat;


import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		
//		BufferedOutputStream x=new BufferedOutputStream(s.getOutputStream());
//		x.write('1');x.flush();;
		
		Receive r=new Receive(s);
		Send se=new Send(s);

		r.start();
		se.start();

	}
}