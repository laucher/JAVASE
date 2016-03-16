package com.javaeasy.simplecopier;

public class Copier {
	private StringBuffer name=new StringBuffer();
	
	public Copier(String s){
			this.name.append(s);
		}
	
	public StringBuffer Getname(){
		
		return this.name;
	}
	public String Setname(String s){
		
		this.name.replace(0, this.name.length(), s);
		
		return this.name.toString();
	}
	
	protected synchronized void printpage(int pagename){
		Thread dead =Thread.currentThread();	
		StringBuffer s = new StringBuffer(dead.getName());
		while(pagename>0){
		System.out.println(Thread.currentThread().getName()+"开始使用打印机"+"\t"+this.name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(s.toString()+"出现了一些不好的事:"+e.getMessage());
		}
		
		System.out.println(s.toString()+"已经使用完成！");
		pagename--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
