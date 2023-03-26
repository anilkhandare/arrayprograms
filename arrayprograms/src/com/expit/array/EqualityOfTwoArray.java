package exercise;

public class EqualityOfTwoArray 
{

	public static void main(String[] args)
	{
		int[] arr1 = { 4, 3, 2, 5, 6,7 };
		int[] arr2 = { 4, 3, 2, 5, 6, 7 };
		int temp = 0;
		if (arr1.length == arr2.length)
		{
			for (int i = 0; i <= arr1.length - 1; i++) 
			{
				if (arr1[i] == arr2[i]) 
				{
					temp++;
				}
			}
			if (temp == arr1.length) 
			{
				System.out.println("both array are equals");
			} else 
			{
				System.out.println("arrays are not equals based on value");
			}
		}
		else
		{
			System.out.println("array are not equal based on length");
		}
	}

}
