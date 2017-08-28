package First;

public class StringVowels {
	
	public static void main(String[] args){
		String s1="KumarPranay";
		
		for(int i=0; i<s1.length(); i++){
			char c=s1.charAt(i);
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				System.out.println("Vowels are : " + c);
				
			}
			
			}
			
		}
		
		
		
	}


