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
		System.out.println(this.name+"�Ĺ��������Ǵ�ӡ"+this.workTime+"�θ�ӡ����");
		for(int i=0;i<this.workTime;i++){			 
			int pagenumber=(int)(Math.random()*10);
			System.out.println(this.name+"��ʼ��ӡ��"+(i+1)+"�Ÿ�ӡ����");
			this.copy.printpage(pagenumber+1);			
		}
		System.out.println("��ã���Ĺ����Ѿ���ɣ�������ȡ���ʣ�"+this.name);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
