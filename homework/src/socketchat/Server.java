package socketchat;

import java.net.*;
import java.util.*;


public class Server {
	private static ServerSocket ss;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("欢迎使用Socket聊天系统");
		System.out.println("请输入您的昵称，默认为Server");
		String name=sc.nextLine();
		System.out.println(name+"欢迎您使用本聊天系统，请等待客户端的连接");
		
		ss=new ServerSocket(9999);
		Socket s=ss.accept();
		System.out.println("连接成功");
		Send send=new Send(s,name,sc);
		Receive receive=new Receive(s);
		send.start();
		receive.start();
		
	}

}
