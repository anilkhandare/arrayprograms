package exercise;

public class IntersectionOfArrayByForEach{

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 2,7,9,0,5,6};
		int[] arr2 = { 4, 3, 2, 5, 1,8};
		System.out.println("intersection of two array is");
		for(int aa:arr1)
		{
			for(int bb:arr2)
			{
				if(aa==bb)
				{
					
					System.out.println(aa);
					
				}
			}
		}

	}

}
