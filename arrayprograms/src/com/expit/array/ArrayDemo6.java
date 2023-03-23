package com.expit.array;

public class ArrayDemo6 {
	public void m1(int[] array){
		System.out.println(array.length);
	}
public static void main(String[] args) {
	System.out.println(new int[]{10,20,30}.length );
	
	System.out.println(new int[]{10,20,30}[0] );
	System.out.println(new int[]{10,20,30}[1] );
	System.out.println(new int[]{10,20,30}[2] );
	ArrayDemo6 arrdemo6=new ArrayDemo6();
	arrdemo6.m1(new int[]{10,20,30});
	
}	
}
