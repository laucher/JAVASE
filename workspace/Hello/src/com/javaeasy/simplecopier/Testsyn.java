package com.javaeasy.simplecopier;

public class Testsyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		synfunction1 syn1=new synfunction1();
		syn1.setS("����");
		synfunction2 syn2=new synfunction2(syn1);
		synfunction2 syn3=new synfunction2(syn1);
		Thread thread1=new Thread(syn2,"1");
		Thread thread2=new Thread(syn2,"2");
		Thread thread3=new Thread(syn3,"3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

  class synfunction1{
	  private  String s;
	  
	  public String setS(String s){
		  this.s=s;
		  return s;
	  }
	  
	   public static void sprint1(){
		 
		System.out.println("����һ����̬�ķ�����");
	  }
	  
	   public synchronized static void ssynprint1(){
		   System.out.println("����һ����̬��ͬ��������");
	   }
	   public synchronized  void synprint2(){
		   System.out.println("����һ��ͬ��������");
	   }
	   public synchronized  void print(){
		   System.out.println("����һ��������");
	   }
	   public void shen(){
		   synchronized(s){
			   System.out.println("��ϲ����S��"+s+"\t"+Thread.currentThread().getName());
		   }
		   System.out.println("������ͬ������飡");
	   }
	   
	   
}
  
 class synfunction2 implements Runnable {
	 private synfunction1 syn;
	 synfunction2(synfunction1 syn){
		 this.syn=syn;
	 }
	@Override
	public void run() {
		synfunction1.sprint1();
		synfunction1.ssynprint1();
		syn.synprint2();
		syn.print();
		syn.shen();
	}
	 
 }