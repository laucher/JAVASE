package Ipo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	
	
	
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(1024);
			//在本机的1024端口监听
			System.out.println("服务器端在1024端口监听~~~");
			Socket s=ss.accept();
			//如果没有客户端连接过来，accept（）方法不会返回
			InputStream in=s.getInputStream();
			OutputStream out=s.getOutputStream();
			PrintWriter pw=new PrintWriter(out);
			//使用PW向客户端输出数据
			System.out.println("正在向客户端发送消息！");
			pw.write("客户端，这里是服务端你好。\t\n");
			pw.flush();
			System.out.println("向客户端发送消息成功！");
			BufferedReader br=new BufferedReader( new InputStreamReader(in));
			
			String response=br.readLine();
			System.out.println("下面是客户端发来的消息\n"+response+"\t结束！");
			s.close();
			ss.close();
			br.close();
			pw.close();
					
		}catch(UnknownHostException e){
			System.out.println("无法找到响应的机器"+e.getMessage());
		}catch(IOException e){
			System.out.println("数据传输异常!"+e.getMessage());
			
		}
		
	}

}
