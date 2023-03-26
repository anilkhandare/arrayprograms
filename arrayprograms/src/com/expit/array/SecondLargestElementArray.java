package exercise;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		int []array= {4,3,5,2,7,1};
		int temp=0;
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
		System.out.println("second largest element in the array ="+array[array.length-2]);

	}

}
