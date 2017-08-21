package First;

import org.testng.annotations.Test;

public class StringArrayDuplicate {
	
	@Test
	public static void m11(){
	String[] a={"A", "B", "A", "C", "B"};
	

	for(int i=0; i<a.length; i++){
		for(int j=i+1; j<a.length; j++){
			if(a[i].equals(a[j])){
				System.out.println(a[j]);
			}
		}
	}
			
			
			
			
			
}
	
	
	
	
	}
