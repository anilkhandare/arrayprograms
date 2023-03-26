
//reverse the array using for loop
package exercise;
import java.util.Arrays;
public class ReverseArrayForLoop {

	public static void main(String[] args) {
		int[] array = { 3, 5, 2, 6, 1, 9 };
		System.out.println("array before reverse=" + Arrays.toString(array));
		System.out.println("array after reverse");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
			
		}

	}

}
