package socketchat;

import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��ӭʹ��Socket����ϵͳ");
		System.out.println("�����������ǳƣ�Ĭ��ΪClient");
		String name=sc.nextLine();
		System.out.println(name+"��ӭ��ʹ�ñ�����ϵͳ");
		System.out.println("������Ҫ���ӵ�IP��ַ");
		String ip=sc.nextLine();
		System.out.println("���ڳ�������"+ip);
		
		Socket s=new Socket(ip,9999);
		Receive receive=new Receive(s);
		System.out.println("���ӳɹ�");
		Send send=new Send(s,name,sc);
		receive.start();
		send.start();
	}

}

