package maven.mavenProject;

import java.util.ArrayList;

public class Learnjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		boolean flag = true;
		
		int arr[] = {1,2,2,3,4,4,5,5,6,7};
		int arraysize = arr.length;
		
		for (int i = 0 ; i<arraysize ; i++) {
		  
			for (int j = i+1 ; j<arraysize ; j++) {
			if (arr[i] == arr[j]) {
				
				//System.out.println("duplicate value"  +arr[i]);
				count++;
				
			}
			
			
			
		}
			//if (count == 0) {System.out.println("not duplicate " +arr[i]);}
			if(count==1) {
	               System.out.println("duplicates "+arr[i]);
		
				/*
				 * ArrayList<Integer> newarr = new ArrayList<Integer>(); newarr.add(arr[i]);
				 * 
				 * System.out.println(newarr);
				 */
			 
	            count = 0;
		
		}
			/*
			 * else {
			 * 
			 * System.out.println("not duplicates " +arr[i]);
			 * 
			 * flag = true; }
			 */
	}

	}}
