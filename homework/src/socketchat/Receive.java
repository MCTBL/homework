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
			System.out.println("正在与"+otherName+"聊天");
//			this.sto=new Storage(otherName);
			while (true) {
				temps = br.readLine();
				temps = Filter.filt(temps);
				if (temps.equals("exit")) {
					System.out.println("对方准备退出聊天系统");
					break;
				} else if (temps.equals("send")) {
					System.out.println("对方即将发送文件请等待");
					String ip = br.readLine();
					String fileName = br.readLine();
					System.out.println("即将接受的文件为：" + fileName);
					f=new FileOperate(ip,fileName);
					if(f.operate()) {
						System.out.println("接收成功");
					}
//					sto.stor("成功接收文件" + fileName);
					continue;
				}
				System.out.println(otherName+":"+temps);
//				sto.stor(Filter.filt(temps));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			if(e.getMessage().equals("Socket closed")) {
				System.out.println("Scoket成功关闭");
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
