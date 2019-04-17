package maven.mavenProject;

public class FindLargestAndSmallest {
	
	public static  void main ( String args[]) {
		
		int[] numbers = {2,87,1,54,2345};
		int largest  = numbers[0];
		int smallest  = numbers[0];
		int i;
		 for ( i = 1 ; i < numbers.length ; i++) {
			 
			 if (largest < numbers[i]) {
				 
				 largest = numbers[i];
				 
				
			 }
			 else if (smallest > numbers[i]) {
				 
				 smallest = numbers[i];
			 }
			 
		 }
		
		 System.out.println("Largest number is : "  +largest);
		 System.out.println("Largest number is : "  +smallest);
		
	}
	

}
