package com.expit.array;

import java.util.Arrays;

public class SortingArrayDemo8 {
 public static void main(String[] args) {
	int a[]={50,1,10,20,70,100,8000};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int i[]=new int[50];
	i[0]=10;
	
	int j[]=new int[30];
	j[0]=20;
	j[1]=30;
	i=j;
	j=i;
	System.out.println(i[0]);
	System.out.println(i[1]);
	System.out.println(j[0]);
	System.out.println(j[1]);
	
}
}
//output:[1, 10, 20, 50, 70, 100, 8000]

