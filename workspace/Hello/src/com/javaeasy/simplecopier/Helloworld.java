package com.javaeasy.simplecopier;

public class Helloworld {

	public static void main(String[] args) {
		Copier copy1=new Copier("惠普");
		Copier copy2=new Copier("佳能");
		Employee worker1=new Employee("项羽",copy1,4);
		Employee worker2=new Employee("天明",copy2,3);
		Thread thread1=new Thread(worker1,worker1.getName());
		Thread thread2=new Thread(worker2,worker2.getName());
		thread1.start();
		thread2.start();
		
		

	}

}
