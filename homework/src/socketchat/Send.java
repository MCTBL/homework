package socketchat;

import java.net.*;
import java.util.*;
import java.io.*;

public class Send extends Thread {
	private Socket s;
	private Scanner sc;
	private BufferedWriter bw;
	private Storage sto;
	private FileOperate f;
	private String name;

	Send(Socket s, String name,Scanner sc) throws Exception {
		this.s = s;
		this.sc = sc;
		this.bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		this.sto = new Storage(name);
		this.name=name;
	}

	void sendMes(String mes) throws IOException {
		bw.write(mes);
		bw.newLine();
		bw.flush();
	}

	void close() throws Exception {
		if(s!=null) {
			s.close();
		}
		if(sc!=null) {
			sc.close();
		}
		if(bw!=null) {
			bw.close();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String temp="";
		File file;
		try {
			sendMes(name);
			while (true) {
				temp = sc.nextLine();
				sendMes(temp);
				if (temp.equals("exit")) {
					break;
				} else if (temp.equals("send")) {
					String ip = InetAddress.getLocalHost().getHostAddress();
					sendMes(ip);
					System.out.println("请输入文件地址");
					while(true) {
						file = new File(sc.nextLine());
						if(file.exists()==true) {
							break;
						}else {
							System.out.println("文件地址有误，请检查");
						}
					}
					sendMes(file.getName());
					f=new FileOperate(file);
					if(f.operate()) {
						System.out.println("发送成功");
					}
					continue;
				}
				sto.stor(Filter.filt(temp));
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
				sto.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
