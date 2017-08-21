package First;

import org.testng.annotations.Test;

public class ArrayAscending {
	
	@Test
	public static void m9(){
	int[] a={5,4,2,6,1,7,9,3};
	int temp;
	
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a.length-1; j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
			
			
		}
		
		
	}
	for(int a1:a){
		System.out.println(a1);
	}
		
		
		
		
		
	}
	
}
