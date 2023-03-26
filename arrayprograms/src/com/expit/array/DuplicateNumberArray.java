package exercise;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		int []array= {2,5,3,4,2,5};
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
