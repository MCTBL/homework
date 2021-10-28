package socketchat;

import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("欢迎使用Socket聊天系统");
		System.out.println("请输入您的昵称，默认为Client");
		String name=sc.nextLine();
		System.out.println(name+"欢迎您使用本聊天系统");
		System.out.println("请输入要链接的IP地址");
		String ip=sc.nextLine();
		System.out.println("正在尝试连接"+ip);
		
		Socket s=new Socket(ip,9999);
		Receive receive=new Receive(s);
		System.out.println("连接成功");
		Send send=new Send(s,name,sc);
		receive.start();
		send.start();
	}

}

