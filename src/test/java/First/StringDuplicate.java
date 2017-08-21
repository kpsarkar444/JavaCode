package First;

import org.testng.annotations.Test;

public class StringDuplicate {

	@Test
	public static void m1() {
		String s1="PranaySarkar";
		String s2="";
		
		for(int i=0; i<s1.length(); i++){
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1){
				s2=s2+c;
				
				
			}
		}
		System.out.println(s2);

	}

}
