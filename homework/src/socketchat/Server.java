package socketchat;

import java.net.*;
import java.util.*;


public class Server {
	private static ServerSocket ss;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��ӭʹ��Socket����ϵͳ");
		System.out.println("�����������ǳƣ�Ĭ��ΪServer");
		String name=sc.nextLine();
		System.out.println(name+"��ӭ��ʹ�ñ�����ϵͳ����ȴ��ͻ��˵�����");
		
		ss=new ServerSocket(9999);
		Socket s=ss.accept();
		System.out.println("���ӳɹ�");
		Send send=new Send(s,name,sc);
		Receive receive=new Receive(s);
		send.start();
		receive.start();
		
	}

}
