package First;

import org.testng.annotations.Test;

public class StringVowels {

	@Test
	public static void m4(){
		String s1="KumarPranaySarkar";
		String s2="";
		
		int count=0;
		for(int i=0; i<s1.length(); i++){
			
			char c=s1.charAt(i);
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count ++;
				System.out.println(c);
				s2=s2+c;	
			}
			
		}
		System.out.println("Vowels are: "  + s2);
		String result = s1.replaceAll("[aeiouAEIOU]", "");
		System.out.println(result);
	
	}
}
