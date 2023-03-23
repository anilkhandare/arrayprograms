package com.expit.array;

public class ArrayDemo4 {
public static void main(String[] args) {
	int a[][]=new int [2][];
	System.out.println(a[0]);
	System.out.println(a[0][0]);
	
	int a1[][]={{10,20},{40,50}};
	System.out.println(a1[0][0]);
	System.out.println(a1[0][1]);
	System.out.println(a1[1][0]);
	System.out.println(a1[1][1]);
}
}
/*o/p
null
Exception in thread "main" java.lang.NullPointerException
	at com.expit.array.ArrayDemo4.main(ArrayDemo4.java:7)
*/
