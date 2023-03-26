package exercise;

public class LeaderOfArray {

	public static void main(String[] args) {
		int[] array = { 2, 11, 5, 3, 9, 1, 7, 5, 3, 6 };
		System.out.println("All leader in the integer array are za");
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				if (array[i] < array[j]) {
					break;
				} else {
					System.out.println(array[i]);
					break;
				}
			}
		}

	}

}
