package maven.mavenProject;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digi = 12345;
	    int rever = 0;
	    
	    while (digi != 0) {
	    	rever = rever*10 + digi%10;
	    	digi = digi/10;
	    	}
	    System.out.println(rever);
		
		/*String digit = "12345";
		String reverse  = "";
		for (int i = digit.length() -1 ; i >= 0 ; i --) {
			
			reverse = reverse + digit.charAt(i);
			
			
		}
System.out.println(reverse*///);
	}
	
	
	
		
	
}
