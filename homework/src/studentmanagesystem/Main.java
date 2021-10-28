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
		
		System.out.println("======欢迎使用学生信息管理系统======");
		System.out.println("请问是从已有的表文件中读取还是新建一张表");
		System.out.println("1:读取");
		System.out.println("2:新建");
//		int tempI=inPut.nextInt();
		tempI=br.readLine();
//		switch (tempI){
//		case 1:
//			System.out.println("请输入文件完整地址");
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
				System.out.println("请输入文件完整地址");
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
			System.out.println("==请输入你想使用的功能==");
			System.out.println("==== 1: 添加学生 ====");
			System.out.println("==== 2: 查询学生 ====");
			System.out.println("==== 3: 更新学生 ====");
			System.out.println("==== 4: 删除学生 ====");
			System.out.println("5:");
			tempI=br.readLine();
			do {
				if(tempI.equals("1")) {
					System.out.println("请输入学生的姓名");
					name=br.readLine();
					System.out.println("请输入学生的学号");
					no=br.readLine();
					System.out.println("请输入学生的电话");
					phone=br.readLine();
					System.out.println("请输入学生的宿舍");
					dorm=br.readLine();
					System.out.println("请输入学生的班级");
					classno=br.readLine();
					Students tempS=new Students(no,name,phone,dorm,classno);
					temp.add(tempS);
					System.out.println(name+"已成功加入列表");
					
					break;
				}else if(tempI.equals("2")) {
					System.out.println("请问是通过姓名还是学号查找");
					System.out.println("姓名输入1，学号输入2");
					tempI=br.readLine();
					do {
						if(tempI.equals("1")) {
							System.out.println("请输入要查找的学生姓名");
							tempI=br.readLine();
							retrieveName(tempI);
							break;
						}else if(tempI.equals("2")) {
							System.out.println("请输入要查找的学生学号");
							tempI=br.readLine();
							retrieveId(tempI);
							break;
						}else {
							System.out.println("输入有误请重新输入");
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
					System.out.println("您输入的数字有误，请重新输入");
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
