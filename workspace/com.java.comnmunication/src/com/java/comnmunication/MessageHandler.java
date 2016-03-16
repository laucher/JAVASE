package com.java.comnmunication;

import java.net.SocketAddress;

public interface MessageHandler {				//代表UDP消息收发模块的接口
	
	void handleMessage(byte [] data, SocketAddress addr);
																//处理消息方法

}
