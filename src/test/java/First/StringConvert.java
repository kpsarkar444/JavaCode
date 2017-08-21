package First;

import org.testng.annotations.Test;

public class StringConvert {

	@Test
	public static void m2() {
		String s1="KUmarPranaySarkar";
		String s2="";
		
		for(int i=0; i<s1.length(); i++){
			int c=s1.charAt(i);
			if(c>=65 && c<=91){
				c=c+32;
				char ch=(char)c;
				System.out.print(ch);
			}
			else if(c>=97 && c<=123){
				c=c-32;
				char ch=(char)c;
				System.out.print(ch);
			}
		}
		

	}

}
