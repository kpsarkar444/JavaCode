package First;


import java.util.HashSet;
import java.util.Set;

public class DuplicateWithSet {

	public static void main(String[] args){
		String[] s={"A", "B", "C", "A"};
		Set<String> set=new HashSet<String>();
		for(String s1:s){
			if(!set.add(s1)){
				System.out.println(s1);
			}
		}
		
	}
}
