package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ListTest {
	
	public List couresToSelect;
	
	
	public ListTest(){
		this.couresToSelect=new ArrayList();
	}
	
	public void testAdd(){
		Course cr1 =new Course("1","���ݽṹ");
		couresToSelect.add(cr1);
		Course cr2=new Course("2","C����");
		couresToSelect.add(1,cr2);
		Course[] cr3={new Course("3","�㷨����"),new Course("4","����ϵͳ")};
		couresToSelect.addAll(Arrays.asList(cr3));
		
		
		
		for(int i=0;i<couresToSelect.size();i++){
			Course temp=(Course)couresToSelect.get(i);
			System.out.println("����˿γ̣�"+temp.id+" "+temp.name);
			
		}

			
//		System.out.println("����˿γ̣�"+temp.id+" "+temp.name);				
//		Course temp1=(Course)couresToSelect.get(1);
//		System.out.println("����˿γ̣�"+temp1.id+" "+temp1.name);
		
	}
	public void aPrint(){
		Iterator temp =couresToSelect.iterator();
		while(temp.hasNext()){
			//Course temp2=(Course)temp.next();
			
			System.out.println(temp.next().toString());			
		}
		System.out.println("���");
	}
	
	public void aRemove(){
		Iterator temp =couresToSelect.iterator();
		while(temp.hasNext()){
			temp.next();
			temp.remove();
			
		}
	}
	public static void main(String[] args){
		ListTest Lt=new ListTest();
		Lt.testAdd();
		Lt.aPrint();
		System.out.println(Lt.couresToSelect.size());
		Lt.aRemove();
		Lt.aPrint();
		System.out.println(Lt.couresToSelect.size());
	}
}
