package maven.mavenProject;

public class pallin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		//char[] pallistr = str.toCharArray();
		String newstr = "";
		for ( int i = str.length()-1; i >= 0 ; i--) {
			newstr = newstr + str.charAt(i);
		
			
			}
		
		System.out.println(newstr);
		  if (str.equals(newstr)) { System.out.println("The string is a palindrome.");}
		 else { System.out.println("The string isn't a palindrome."); }
		 
		 }}

		/*String str="MADAM";
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		 
		if(revstring.equalsIgnoreCase(str)){
		System.out.println("The string is Palindrome");
		}
		else{
		System.out.println("Not Palindrome");
		}}}*/