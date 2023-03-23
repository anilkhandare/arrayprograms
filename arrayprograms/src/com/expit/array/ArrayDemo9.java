package com.expit.array;

public class ArrayDemo9 {
 
	public static void main(String[] args) {
		Object obj[]={1,3,5,"ABC",'A',10.0,49999999};
		System.out.println(obj.toString());
		System.out.println(obj[0]);
		System.out.println(obj[3]);
		System.out.println(obj[4]);
	}
  
}
/*o/p: [Ljava.lang.Object;@1db9742
1
ABC
A
*/