//find the minimum and maximum value of array using Arrays method
package exercise;
import java.util.Arrays;

public class MinMaxElementArrayMethod {

	public static void main(String[] args) {
		int[] array= {7,2,5,3,8};
		Arrays.sort(array);
       System.out.println("minimum element in the array="+array[0]);
       System.out.println("maximum element in the array="+array[array.length-1]);
	}
}
