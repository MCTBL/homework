package socketchat;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Send extends Thread{
	Socket s;
	BufferedOutputStream out;
	String tempS;
	char temp1[];
	byte temp2[];
	Scanner sc;
	
	public Send(Socket s) throws IOException {
		// TODO Auto-generated constructor stub
		this.s=s;
//		this.getStream();
//		this.sc=new Scanner(System.in);
	}
	
//	private void getStream() throws IOException {
//		this.out=new BufferedOutputStream(s.getOutputStream());
//	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		try {
			out = new BufferedOutputStream(s.getOutputStream());
			while (true) {
				temp1 = sc.nextLine().toCharArray();
				temp2 = new byte[temp1.length];
				for (int i = 0; i < temp1.length; i++) {
					temp2[i] = (byte) temp1[i];
				}
				out.write(temp2);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
