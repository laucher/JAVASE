package com.imooc.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arrInt[]={17,40,12,6,15,16,8,10,18,50};
		
		Arrays.sort(arrInt);
		
		Scanner scan=new Scanner(System.in);
		
		int i=scan.nextInt();
		
		for (int j = 0; j < arrInt.length; j++) {
			System.out.print(arrInt[j]+" ");
		}
		
		System.out.println();
		
		int seaInt=Arrays.binarySearch(arrInt,i);
		
		System.out.println(seaInt);
		
		scan.close();
		
	}

}
