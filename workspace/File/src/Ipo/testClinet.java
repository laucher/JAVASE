package Ipo;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class testClinet {

	public static void main(String[] args) throws Exception{
		byte [] addr={127,0,0,1};
		InetAddress adress=InetAddress.getByAddress(addr);
		Socket socket=new Socket(adress,18888);
		OutputStream os=socket.getOutputStream();
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write("’ ªß£∫admin"); 
		bw.flush();
		bw.write("√‹¬Î£∫admin"); 
		bw.flush();
		
		socket.shutdownOutput();
		
		bw.close();
		osw.close();
		os.close();
		socket.close();
	}

}
