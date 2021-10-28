package socketchat;

import java.io.*;
import java.text.*;
import java.util.*;

public class Storage {
	private BufferedWriter bw;
	private Date day;
	private SimpleDateFormat sdf = new SimpleDateFormat("[YYYY/MM/dd HH:mm:ss]");
	private String readyWrite = "", name;

	public Storage(String name) throws IOException {
		// TODO Auto-generated constructor stub
		this.bw = new BufferedWriter(new FileWriter("log.txt", true));
		this.name = name;
	}
	
	void close() throws Exception {
		bw.close();
	}

	public void stor(String temp) {
		try {
			day = new Date();
			readyWrite = sdf.format(day) + name + " : " + temp;
			bw.write(readyWrite);
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
