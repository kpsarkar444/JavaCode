package First;

import org.testng.annotations.Test;

public class IntergerIsPallindrome {
	
	@Test
	public void m17(){
		int num=123454321;
		int reverse=0;
		int flag=1;
		while(num!=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			if(flag==0){
				break;
			}
			
		}
		System.out.println(reverse);
		if(flag==1){
			System.out.println("pallindrome");
		}
		else{
			System.out.println("not pallindrome");
		}
	}

}
