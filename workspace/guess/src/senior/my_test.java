package senior;

import java.util.*;
public class my_test {
	private  int g;
	private  int c;
	public int getG() {
		return g;
	}
	public void setG(int G) {
		g = G;
	}
	public int getC() {
		return c;
	}
	public void setC(int C) {
		this.c = C;
	}
	public static void main(String[] arges){
		my_test hello=new my_test();
		my_test hello2=new my_test();
		hello.setC(20);
		hello.setG(10);
		//hello.g=9;hello2.c=8;
		System.out.println(hello.getC()+"and"+hello.getG());
		System.out.println(hello2.getC()+"and"+hello2.getG());
		
	}
}

