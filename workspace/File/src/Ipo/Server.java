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
			//�ڱ�����1024�˿ڼ���
			System.out.println("����������1024�˿ڼ���~~~");
			Socket s=ss.accept();
			//���û�пͻ������ӹ�����accept�����������᷵��
			InputStream in=s.getInputStream();
			OutputStream out=s.getOutputStream();
			PrintWriter pw=new PrintWriter(out);
			//ʹ��PW��ͻ����������
			System.out.println("������ͻ��˷�����Ϣ��");
			pw.write("�ͻ��ˣ������Ƿ������á�\t\n");
			pw.flush();
			System.out.println("��ͻ��˷�����Ϣ�ɹ���");
			BufferedReader br=new BufferedReader( new InputStreamReader(in));
			
			String response=br.readLine();
			System.out.println("�����ǿͻ��˷�������Ϣ\n"+response+"\t������");
			s.close();
			ss.close();
			br.close();
			pw.close();
					
		}catch(UnknownHostException e){
			System.out.println("�޷��ҵ���Ӧ�Ļ���"+e.getMessage());
		}catch(IOException e){
			System.out.println("���ݴ����쳣!"+e.getMessage());
			
		}
		
	}

}
