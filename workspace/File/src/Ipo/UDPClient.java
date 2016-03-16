package Ipo;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception{
		
		InetAddress address =InetAddress.getByName("localhost");
		
		int port=8888;
		
		byte[] date="”√ªß√˚£∫admin£ª√‹¬Î£∫123".getBytes();
		
		DatagramPacket packet= new DatagramPacket(date,date.length, address, port);
		
		DatagramSocket socket= new DatagramSocket();
		
		socket.send(packet);
		
		//ObjectOutputStream oos=new ObjectOutputStream(out);
		
	}
 
}
