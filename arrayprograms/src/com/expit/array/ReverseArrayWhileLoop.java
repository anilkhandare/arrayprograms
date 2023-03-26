
//reverse the array using while loop
package exercise;
public class ReverseArrayWhileLoop {

	public static void main(String[] args) {
		int[] array = { 3, 5, 2, 6, 1, 9 };
		int size=array.length-1;
		while(size>=0)
		{
			System.out.println(array[size]);
			size--;
		}

	}

}
