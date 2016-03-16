package com.imooc.test;

import javax.sound.midi.SysexMessage;



public class Test1 {
	
	static{
		System.out.println("3.public 类的静态代码块被调用！");
	}

	public static void main(String[] args) {
		new Person();
	}

}
class Person{
	public Person(){
		System.out.println("1.pubilc Preson().");
	}
	
	static{
		System.out.println("2.Preson static");
	}
	
}

