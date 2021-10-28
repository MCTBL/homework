package studentmanagesystem;

import java.io.*;
import java.util.LinkedList;

public class Storage {
//	private static BufferedWriter bw;
	private static BufferedReader br;
	private static File file;
	private static String temp="";
//	private static String temp1[];为啥就是不可？？？？？？？？？？？？？？？？？？？？？？？？？？？
//	private static int tempid;
//	private static String tempname;
//	private static int tempphonenumber;
//	private static String tempdormno;
//	private static String tempclassno;
//	private static Students tempStudent;
	
	public static void save(String add) {
		// TODO Auto-generated method stub
		
	}
	
	public static LinkedList<Students> load(String add) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Students> list=new LinkedList<Students>();
		
		String temp1[];
		String tempid="";
		String tempname="";
		String tempphonenumber="";
		String tempdormno="";
		String tempclassno="";
		Students tempStudent;
		
		
		file=new File(add);
		while(!file.exists()) {
			System.out.println("输入的地址有误，请检查后重输");
			file=new File(Main.br.readLine());
		}
		
		try {
//			bw=new BufferedWriter(new FileWriter(file));
			br=new BufferedReader(new FileReader(file));
			while((temp=br.readLine())!=null) {
				temp1=temp.split("：| ");
				for(int i=1;i<=9;i+=2) {
					switch (i) {
					case 1:
						tempname=temp1[i];
						break;
					case 3:
						tempid=temp1[i];
						break;
					case 5:
						tempphonenumber=temp1[i];
						break;
					case 7:
						tempdormno=temp1[i];
						break;
					case 9:
						tempclassno=temp1[i];
						break;
					}
				}
				tempStudent=new Students(tempid,tempname,tempphonenumber,tempdormno,tempclassno);
				list.add(tempStudent);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return list;
	}
}
