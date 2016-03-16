package Ipo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		//1.创建服务器DatagramSocket，指定端口
		DatagramSocket socket=new DatagramSocket(8888);
		//2.创建数据报，用于接受客户端发送的数据
		byte[] data =new byte[1024];//创建字节数组，指定接受的数据包的大小。
		DatagramPacket packet=new DatagramPacket(data, data.length);
		System.out.println("*********服务器端已经启动，等待客户端的消息**********");
		//3.接收客户端发送的数据
		socket.receive(packet);//此方法在接收到数据报之前会一直阻塞
		//读取数据
		String infor=new String(data,0,packet.getLength());
		System.out.println("我是服务器，客户端说："+infor);
	}

}
