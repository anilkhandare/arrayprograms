package exercise;

public class EqualityOfTwoStringArray {

	public static void main(String[] args) {
		String[] array1 = { "pune", "delhi", "mumbai", "nagpur"};
		String[] array2 = { "pune", "delhi", "mumbai", "nagpur"};
		int temp = 0;
		if (array1.length == array2.length) {
			for (int i = 0; i <= array1.length - 1; i++) {
				if (array1[i].equals(array2[i])) {
					temp++;
				}

			}
			if (temp == array1.length) {
				System.out.println("both array are equals");
			} else {
				System.out.println("both array are not equals based on value");
			}
		}
		else
		{
			System.out.println("both array are not equal based on length");
		}

	}

}
