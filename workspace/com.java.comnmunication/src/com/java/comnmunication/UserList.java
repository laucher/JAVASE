package com.java.comnmunication;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UserList implements Serializable{
	
	private String name=null;  //�û����ǳ�
	
	private String passworld=null; //�û�������
	
	private int port=0; //�û��Ķ˿�
	
	private InetAddress addr=null; //�û��Ķ˿�
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassworld() {
		return passworld;
	}

	public void setPassworld(String passworld) {
		this.passworld = passworld;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public InetAddress getAddr() {
		return addr;
	}

	public void setAddr() { //����IP��ַ
		
		try {
			this.addr =InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("�޷�Ԥ֪��IP��ַ!");
		}
	}
	
	public String talkChat(String s){
		
		
		return s;
	}
	
	

}
