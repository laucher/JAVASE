package Ipo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class testServerClient {

	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket= new ServerSocket(18888);
		
		System.out.println("*******��������������*******");
		Thread.sleep(5000);
		
		Socket socket=serverSocket.accept();
		
		InputStream input=socket.getInputStream();
		
		InputStreamReader isr=new InputStreamReader(input);
		
		BufferedReader br=new BufferedReader(isr);
		
		String info=null;
		
		while((info=br.readLine())!=null){
			System.out.println("���Ƿ��������ͻ���˵��"+info);
		}
		
		socket.shutdownInput();
		
		br.close();
		isr.close();
		input.close();
		socket.close();
		serverSocket.close();
		
		
		
		
		
		
	}

}
