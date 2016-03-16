package Typelist;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Typetype {
	private int i=0;
	private  int j=0;
	private  String s="s";
	
	public Typetype(){
		System.out.println("this is a const.");
	}
	
	public void print(){
		System.out.println("this is a moteh");
	}

	public static void main(String[] args) {
		Class<?> type=Typetype.class;
		Method [] m1=type.getDeclaredMethods();
		Field[] field=type.getDeclaredFields();
		for(Method i:m1){
			System.out.println(i.getName());
		}
		for(Field i:field){
			System.out.println(i.getName());
		}
		

	}

}

class Typeextends extends Typetype{
	 
	public String s2="myself";
	
	public void printf(){
		System.out.println("这是子方法");
	}
	
}
