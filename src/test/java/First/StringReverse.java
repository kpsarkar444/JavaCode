package First;

import org.testng.annotations.Test;

public class StringReverse {

	@Test
	public static void m3(){
		String s1="KumarPranaySarkar";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--){
			char c=s1.charAt(i);
			s2=s2+c;
		}
		System.out.println(s2);
	}
}
