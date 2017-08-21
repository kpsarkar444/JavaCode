package First;

import org.testng.annotations.Test;

public class StringOnlyNumber {
	
	@Test
	public static void m5(){
		
		String s1="ABD123JIHE46578";
		for(int i=0; i<s1.length(); i++){
			char c=s1.charAt(i);
			if(c>=48 && c<=57){
				System.out.print(c);
			}
		}
	}

}
