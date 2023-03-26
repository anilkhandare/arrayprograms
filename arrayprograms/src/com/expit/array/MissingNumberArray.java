package exercise;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		int array[]= {1,2,4,5,7,8,10}; //here 3,6,9 are missing
		//int array[]= {2,4,6,10};
			int n=array.length+1;
				Arrays.sort(array);
				
				int diff=array[1]-array[0];
				int tempNo= array[0];
				
				for(int i=0;i<array.length;i++) {
					
					if(tempNo != array[i] ) {
						System.out.println(tempNo);
						tempNo+=diff;
						
					}
					
					tempNo += diff;
					
				}
				
	}

}
