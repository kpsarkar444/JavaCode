package First;

import org.testng.annotations.Test;

public class Triangle {
	@Test
	public static void m15(){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" "     );
			}
			for(int k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("done triangle Pull");
	}

}
