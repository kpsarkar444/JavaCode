package First;

import org.testng.annotations.Test;

public class ArrayDuplicate {
	
	@Test
	public static void m10(){
		
		int[] a={1,4,3,6,2,7,2,4};
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				
				if(a[i]==a[j]){
					System.out.println(a[j]);
				}
			}
		}
		
		
	}

}
