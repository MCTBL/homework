package socketchat;

import java.net.Socket;
import java.io.*;
	
public class Receive extends Thread{
	Socket s;
	BufferedInputStream in;
//	BufferedReader br;
	String tempS="";
	byte temp[]=new byte[1024];
	int no;
	
	public Receive(Socket s) throws IOException {
		// TODO Auto-generated constructor stub
		this.s=s;
//		this.getStream();
	}
	
//	private void getStream() throws IOException {
//		// TODO Auto-generated method stub
//		this.in=new BufferedInputStream(s.getInputStream());
////		this.br=new BufferedReader(new InputStreamReader(in));
//	}
	
	@Override
	public void run(){
		// TODO Auto-generated method stub
		try {
			in = new BufferedInputStream(s.getInputStream());
			while (true) {

				while ((no = in.read(temp)) != -1) {
					tempS = tempS + new String(temp, 0, no);
				}
				System.out.println(tempS);
				tempS = "";
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
	}
}
