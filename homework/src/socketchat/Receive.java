package socketchat;

import java.io.*;
import java.net.*;
import java.util.*;

public class Receive extends Thread {
	private Socket s;
	private Storage sto;
	private BufferedReader br;
	private FileOperate f;

	Receive(Socket s) throws Exception {
		this.s = s;
		this.br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}

	void close() throws Exception {
		if(s!=null) {
			s.close();
		}
		if(br!=null) {
			br.close();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String temps="",otherName;
		try {
			otherName=br.readLine();
			System.out.println("������"+otherName+"����");
//			this.sto=new Storage(otherName);
			while (true) {
				temps = br.readLine();
				temps = Filter.filt(temps);
				if (temps.equals("exit")) {
					System.out.println("�Է�׼���˳�����ϵͳ");
					break;
				} else if (temps.equals("send")) {
					System.out.println("�Է����������ļ���ȴ�");
					String ip = br.readLine();
					String fileName = br.readLine();
					System.out.println("�������ܵ��ļ�Ϊ��" + fileName);
					f=new FileOperate(ip,fileName);
					if(f.operate()) {
						System.out.println("���ճɹ�");
					}
//					sto.stor("�ɹ������ļ�" + fileName);
					continue;
				}
				System.out.println(otherName+":"+temps);
//				sto.stor(Filter.filt(temps));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			if(e.getMessage().equals("Socket closed")) {
				System.out.println("Scoket�ɹ��ر�");
			}
		} finally {
			try {
				close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
