package exercise;

public class RepeatingElementArray {

	public static void main(String[] args) {
		int array[] = { 2, 4, 3, 7, 3, 2, 6, 2, 2 ,2};
		int temp = 0;
		
		for (int i = 0; i <= array.length - 1; i++) {
			
			for (int j = i+1; j <= array.length - 1; j++) {
				if (array[i] == array[j]) {
               
              
				System.out.println(array[i]);
				break;
				}
				
			
			}
		
		}
	}

}
