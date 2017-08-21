package First;



import org.testng.annotations.Test;

public class PrimeNumber {
	@Test
	public static void m13(){
		
		
		int n=5;
		
		int flag=1;
		for(int i=2; i<n; i++){
			if(n%i==0){
				flag=0;
				break;
			}
			
			
		}
		if(flag==1){
			System.out.println("it is prime number");
		}
		else{
			System.out.println("it is not prime number");
		}
		
	}

}
