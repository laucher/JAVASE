package com.imooc.collection;

public class Course {

//	�γ���
	public String id;
	
	public String name;
	
	public Course(String id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	
	public String toString(){
		return this.id+"��һ��"+this.name;
		
	}
}
