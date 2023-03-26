//find the minimum and maximum value of array using loop
package exercise;
public class MinMaxElementArrayLoop {

	public static void main(String[] args) {
		int[] array= {7,2,5,3,8,1};
		int temp=0;
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		 System.out.println("minimum element in the array="+array[0]);
	       System.out.println("maximum element in the array="+array[array.length-1]);

	}

}
