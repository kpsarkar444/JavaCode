package First;

import org.testng.annotations.Test;

public class ArraySecondBig {
	@Test
	public static void m7(){
		int[] a={2,4,7,1,9,10,3};
		
		int big=0; int second=0;
		for(int i=0; i<a.length; i++){
			
			if(a[i]>big){
				second=big;
				big=a[i];
			}
			
			else if(a[i]>second){
				second=a[i];
				
			}
		}
		System.out.println(second);
		
		
		
		
	}

}
