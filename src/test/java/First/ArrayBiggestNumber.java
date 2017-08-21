package First;

import org.testng.annotations.Test;

public class ArrayBiggestNumber {
	@Test
	public static void m6(){
		
		int[] a={1,4,2,6,2,8,5,6,7};
		
		int big=0;
		
		for(int i=0 ; i<a.length; i++){
			if(a[i]>big){
				big=a[i];
			}
		}
		System.out.println(big);
	}

}
