package maven.mavenProject;

public class CountVoweldigialpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to k India1";
		int vowels = 0;
		int consonants = 0;
		int digits = 0 ;
		
		str = str.toLowerCase();
		
		for (int i = 0 ; i < str.length() ; i++)
		{
		
			char ch = str.charAt(i);
			//System.out.print(ch);
			
			if( ch == 'a' || ch  == 'e' || ch == 'i' || ch == 'o' || ch  == 'u' ) {
				
				vowels++;
				
			}
			else if (ch > 'a'  && ch < 'z') {
				
				consonants++;
				
			}
			
			else if (ch>= '0' && ch<='9') {
				
				digits++;
			}
		}
		System.out.println( "  Vowels Found :  " +vowels);
		System.out.println("Consonants found : "  +consonants);
		System.out.println(" Digits Found : "   +digits);

	}

}
