package socketchat;

import java.io.*;
import java.net.*;

public class FileOperate{
	
	private Socket receiveSocket,sendSocket;
	private ServerSocket serverSocket;
	private File f;
	private String ip;
	private BufferedInputStream bi;
	private BufferedOutputStream bo;
	
	private operateType ot;
	private static enum operateType{
		send, receive
	}
	
	public FileOperate(String ip,String fileName) throws Exception {
		// TODO Auto-generated constructor stub
		// recrive
		this.ot=operateType.receive;
		this.ip=ip;
		f=new File(fileName);
	}
	
	public FileOperate(File f) throws IOException {
		// TODO Auto-generated constructor stub
		// send
		this.ot=operateType.send;
		serverSocket=new ServerSocket(9998);
		this.f=f;
	}
	
	public boolean operate() throws Exception {
		switch (ot) {
		case send:
			sendSocket=serverSocket.accept();
			
			bi=new BufferedInputStream(new FileInputStream(f));
			bo=new BufferedOutputStream(sendSocket.getOutputStream());
			
			bo.write(bi.readAllBytes());bo.flush();
			
			bi.close();
			bo.close();
			sendSocket.close();
			serverSocket.close();
			
			return true;
		case receive:
			receiveSocket=new Socket(ip,9998);
			
			bi=new BufferedInputStream(receiveSocket.getInputStream());
			bo=new BufferedOutputStream(new FileOutputStream(f));
			
			bo.write(bi.readAllBytes());bo.flush();
			
			bi.close();
			bo.close();
			receiveSocket.close();
			
			return true;
		}
		return false;
	}
}