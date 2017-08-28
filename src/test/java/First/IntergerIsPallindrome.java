package First;

import org.testng.annotations.Test;

public class IntergerIsPallindrome {
	
	@Test
	public void m17(){
		int num=123454321;
		int reverse=0;
		
		while(num!=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
			
		}
		System.out.println(reverse);
		
	}

}
