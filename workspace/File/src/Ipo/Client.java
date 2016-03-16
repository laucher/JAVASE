package Ipo;
import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws IOException {
		byte[] addr=new byte[] {127,0,0,1};
		InetAddress local=InetAddress.getByAddress(addr);
		Socket s=new Socket(local,1024);
		OutputStream out=s.getOutputStream();
		InputStream in=s.getInputStream();
		InputStreamReader isr=new InputStreamReader(in);
		PrintWriter pw1=new PrintWriter(out);
		pw1.write("服务端你好,这是客户端！");
		pw1.flush();
		BufferedReader br=new BufferedReader(isr);
		String response=br.readLine();
		System.out.println(response);
		pw1.close();
		br.close();
		s.close();
	}

}
