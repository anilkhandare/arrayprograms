package exercise;

public class IntersectionOfTwoStringArray {

	public static void main(String[] args) {
		String[] array1 = { "pune", "delhi", "mumbai", "nagpur"};
		String[] array2 = { "nagar", "nashik", "pune", "mumbai" };
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array2.length - 1; j++) {
				if (array1[i].equals(array2[j])) {
					System.out.println(array1[i]);
					break;
				}

			}

		}
	}

}
