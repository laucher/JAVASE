package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

//Ñ§ÉúÀà
public class Student {
	
	public String id;
	
	public String name;
	
	public Set<?> courses;
	
	public Student(String id,String mame){
		this.id=id;
		this.name=name;
		courses=new HashSet();
	}
	
}
