package com.javaeasy.simplecopier;

public class Employee implements Runnable {
	private  String name;
	private	Copier copy;
	private int workTime;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String s,Copier copy,int  i){
		this.name=s;
		this.copy=copy;
		this.workTime=i;
	}

	@Override
	public synchronized void run() {
		System.out.println(this.name+"的工作内容是打印"+this.workTime+"次复印件。");
		for(int i=0;i<this.workTime;i++){			 
			int pagenumber=(int)(Math.random()*10);
			System.out.println(this.name+"开始打印第"+(i+1)+"张复印件。");
			this.copy.printpage(pagenumber+1);			
		}
		System.out.println("你好，你的工作已经完成，请来领取工资！"+this.name);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
