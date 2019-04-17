package maven.mavenProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] obj = new Object[2][2];
		obj[0][0] = 100;
		obj[0][1] = 200;
		obj[1][0] = 300;
		obj[1][1] = 400;
		
		return obj; 
		
		
		
		
	}
	@DataProvider
	public Iterator[][] getValue() {
		Iterator[][] obj = null;
		
		 ArrayList al = new ArrayList();
	      
	      // add elements to the array list
	      al.add("1");
	      al.add("2");
	 while(   al.iterator().hasNext()) {
		 
		obj = (Iterator[][]) al.iterator().next();
		 
	 }
	
		return obj;
	}
	
	@Test(dataProvider = "getValue")
	public void test2(String val) {
		
		System.out.println(val);
	
	}
	
	@Test(dataProvider = "getData" )
	public void dataProviderTest1(int num , int num2) {
		
		System.out.println(num);
		System.out.println(num2);
		
		
	}
}
