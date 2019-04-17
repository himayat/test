package maven.mavenProject;

public class findPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numseries = 9;
		boolean flag = false;
		
		
		
	/*if(num <=1) {
		System.out.println(" Not Prime ");
		
	}*/
for (int num = 2 ;num <= numseries ; num++ ) {
	for (int i = 2 ; i <= num/2 ; i++) {
	if(num%i == 0 ) {
		
		flag = true;
		break;
	}
	
	flag = false;	
}		
	
	
	if (!flag)
	System.out.println(num + " is a prime number."); 
		  else
		  System.out.println(num + " is not a prime number.");
		 
		//System.out.println(" Prime " + num);

		 /*int num = 9;
	        boolean flag = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }*/

}}}
