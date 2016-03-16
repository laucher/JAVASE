package com.java.comnmunication;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UserList implements Serializable{
	
	private String name=null;  //用户的昵称
	
	private String passworld=null; //用户的密码
	
	private int port=0; //用户的端口
	
	private InetAddress addr=null; //用户的端口
	

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

	public void setAddr() { //设置IP地址
		
		try {
			this.addr =InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("无法预知的IP地址!");
		}
	}
	
	public String talkChat(String s){
		
		
		return s;
	}
	
	

}
