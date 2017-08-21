package First;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SwapArrayNumber {
	
	@Test
	public  void m16(){
		int[] x={1,2,3,4,5};
		int[] y={6,7,8,9,10};
		
		swapvalue(x,y);
		System.out.println("x :" + Arrays.toString(x));
		
		System.out.println("y : " + Arrays.toString(y));
		
		
	}
	
	static void swapvalue(int[] a, int[] b){
		for(int i=0; i<a.length; i++){
			
			a[i]=a[i]+b[i];
			b[i]=a[i]-b[i];
			a[i]=a[i]-b[i];
		}
	}
	
	
	
	
	
}
