package Ipo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		//1.����������DatagramSocket��ָ���˿�
		DatagramSocket socket=new DatagramSocket(8888);
		//2.�������ݱ������ڽ��ܿͻ��˷��͵�����
		byte[] data =new byte[1024];//�����ֽ����飬ָ�����ܵ����ݰ��Ĵ�С��
		DatagramPacket packet=new DatagramPacket(data, data.length);
		System.out.println("*********���������Ѿ��������ȴ��ͻ��˵���Ϣ**********");
		//3.���տͻ��˷��͵�����
		socket.receive(packet);//�˷����ڽ��յ����ݱ�֮ǰ��һֱ����
		//��ȡ����
		String infor=new String(data,0,packet.getLength());
		System.out.println("���Ƿ��������ͻ���˵��"+infor);
	}

}
