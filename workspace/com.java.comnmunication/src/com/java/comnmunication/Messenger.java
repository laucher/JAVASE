package com.java.comnmunication;

import java.net.SocketAddress;

public interface Messenger {		//����UDP��Ϣ�շ�ģ��Ľӿ�
	
		public void setMessngerHandler(MessageHandler handler);
												//������Ϣ������
		public void sendData(byte[] data,SocketAddress addr); //������Ϣ
		
		public void startMessenger(); //��ʼ��Ϣ����
		

}
