package com.imooc.test;

import javax.sound.midi.SysexMessage;



public class Test1 {
	
	static{
		System.out.println("3.public ��ľ�̬����鱻���ã�");
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

