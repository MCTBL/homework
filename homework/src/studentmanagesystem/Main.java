package studentmanagesystem;

import java.io.*;
import java.util.*;

public class Main {
//	public static Scanner inPut=new Scanner(System.in);
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Students> temp = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name,no,phone,classno,dorm,tempI;
		
		System.out.println("======��ӭʹ��ѧ����Ϣ����ϵͳ======");
		System.out.println("�����Ǵ����еı��ļ��ж�ȡ�����½�һ�ű�");
		System.out.println("1:��ȡ");
		System.out.println("2:�½�");
//		int tempI=inPut.nextInt();
		tempI=br.readLine();
//		switch (tempI){
//		case 1:
//			System.out.println("�������ļ�������ַ");
//			String tempS=br.readLine();
//			temp=Storage.load(tempS);
////			temp=Storage.load("C:\\Users\\Jackie-zhong\\eclipse-workspace\\parctice\\a.txt");
//			break;
//		case 2:
//			temp=new LinkedList<Students>();
//			break;
//		}
		do {
			if(tempI.equals("1")) {
				System.out.println("�������ļ�������ַ");
				String tempS=br.readLine();
				temp=Storage.load(tempS);
				break;
			}else if(tempI.equals("2")) {
				temp=new LinkedList<Students>();
				break;
			}
		}while(true);
		
		
//		for(Students a:temp) {
//			System.out.println(a);
//		}

		while(true) {
			System.out.println("==����������ʹ�õĹ���==");
			System.out.println("==== 1: ���ѧ�� ====");
			System.out.println("==== 2: ��ѯѧ�� ====");
			System.out.println("==== 3: ����ѧ�� ====");
			System.out.println("==== 4: ɾ��ѧ�� ====");
			System.out.println("5:");
			tempI=br.readLine();
			do {
				if(tempI.equals("1")) {
					System.out.println("������ѧ��������");
					name=br.readLine();
					System.out.println("������ѧ����ѧ��");
					no=br.readLine();
					System.out.println("������ѧ���ĵ绰");
					phone=br.readLine();
					System.out.println("������ѧ��������");
					dorm=br.readLine();
					System.out.println("������ѧ���İ༶");
					classno=br.readLine();
					Students tempS=new Students(no,name,phone,dorm,classno);
					temp.add(tempS);
					System.out.println(name+"�ѳɹ������б�");
					
					break;
				}else if(tempI.equals("2")) {
					System.out.println("������ͨ����������ѧ�Ų���");
					System.out.println("��������1��ѧ������2");
					tempI=br.readLine();
					do {
						if(tempI.equals("1")) {
							System.out.println("������Ҫ���ҵ�ѧ������");
							tempI=br.readLine();
							retrieveName(tempI);
							break;
						}else if(tempI.equals("2")) {
							System.out.println("������Ҫ���ҵ�ѧ��ѧ��");
							tempI=br.readLine();
							retrieveId(tempI);
							break;
						}else {
							System.out.println("������������������");
						}
					}while(true);
					
					break;
				}else if(tempI.equals("3")) {
					
					break;
				}else if(tempI.equals("4")) {
					
					break;
				}else if(tempI.equals("5")) {
					
					break;
				}else {
					System.out.println("�������������������������");
				}
			}while(true);
		}
	}
	
	private static void retrieveId(String id) {
		// TODO Auto-generated method stub

	}
	
	private static void retrieveName(String name) {
		// TODO Auto-generated method stub

	}

}
