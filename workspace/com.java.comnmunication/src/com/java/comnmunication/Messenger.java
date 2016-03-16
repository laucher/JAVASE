package com.java.comnmunication;

import java.net.SocketAddress;

public interface Messenger {		//代表UDP消息收发模块的接口
	
		public void setMessngerHandler(MessageHandler handler);
												//设置消息处理器
		public void sendData(byte[] data,SocketAddress addr); //发送消息
		
		public void startMessenger(); //开始消息发送
		

}
