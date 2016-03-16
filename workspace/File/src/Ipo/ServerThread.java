package Ipo;

import java.net.Socket;

public class ServerThread extends Thread {
	
	Socket socket=null;
	
	public ServerThread(Socket socket){
		
		this.socket=socket;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
