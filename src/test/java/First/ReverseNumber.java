package First;

import org.testng.annotations.Test;

public class ReverseNumber {
	
	@Test
	public static void m15(){
		int num=123456789;
		int reverse=0;
		while(num!=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
		}
		System.out.println(reverse);
	}

}
