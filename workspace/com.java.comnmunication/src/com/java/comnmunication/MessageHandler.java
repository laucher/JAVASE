package com.java.comnmunication;

import java.net.SocketAddress;

public interface MessageHandler {				//����UDP��Ϣ�շ�ģ��Ľӿ�
	
	void handleMessage(byte [] data, SocketAddress addr);
																//������Ϣ����

}
