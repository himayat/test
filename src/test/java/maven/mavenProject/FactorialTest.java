package maven.mavenProject;

import org.testng.annotations.Test;

public class FactorialTest {
	
	@Test
	public void factorial() {
		int num = 3;
		int fact = 1;
		
		for (int i = num ; i>0 ; i--) {
			
			fact = fact*i;
			
		}
		
		System.out.println(fact);
	}

}
