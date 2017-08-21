package First;

import org.testng.annotations.Test;

public class Fibonnaci {
	@Test
	public static void m14(){
		
		int n=5;
		int n1=0; int n2=1; int n3;

		
		for(int i=0; i<=n; i++){
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			System.out.println("");
		}
		
		
	}

}
