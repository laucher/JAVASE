package com.javaeasy.simplecopier;

public class Helloworld {

	public static void main(String[] args) {
		Copier copy1=new Copier("����");
		Copier copy2=new Copier("����");
		Employee worker1=new Employee("����",copy1,4);
		Employee worker2=new Employee("����",copy2,3);
		Thread thread1=new Thread(worker1,worker1.getName());
		Thread thread2=new Thread(worker2,worker2.getName());
		thread1.start();
		thread2.start();
		
		

	}

}
