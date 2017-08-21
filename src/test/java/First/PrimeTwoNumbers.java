package First;

import org.testng.annotations.Test;

public class PrimeTwoNumbers {
	@Test
	public static void m16(){
		
		int a=1;
		int b=10;
		
		for(int i=a; i<=b; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int n){
		boolean flag=true;
		for(int j=2; j<=n-1; j++){
			if(n%j==0){
				flag=false;
				break;
			}
		}
		return flag;
	}

}
