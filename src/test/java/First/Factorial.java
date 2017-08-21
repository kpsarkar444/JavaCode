package First;



import org.testng.annotations.Test;

public class Factorial {
	
	@Test
	public static void m12(){
		
		int n=4;
		
		int fact=1;
		for(int i=1; i<=n; i++){
			fact=fact*i;
			System.out.println("Fact is fcat : " + fact);
		}
		
	}

}
