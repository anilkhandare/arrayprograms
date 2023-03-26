package exercise;

public class MaximumIndexArray {

	public static void main(String[] args) {
		int array[] = { 11, 5, 3, 7, 2, 9, 10,13 };
		int temp = array[0];
		int index = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			if (temp < array[i]) {
				temp = array[i];
				index = i;
			}
		}
		System.out.println("index of maximum number is= " + index);
	}

}
