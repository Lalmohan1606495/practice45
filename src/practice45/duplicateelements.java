package practice45;

import java.util.HashSet;
import java.util.Set;

public class duplicateelements {

	public static void main(String[] args) {
     
		
		int[] arr= {2,3,4,5,6,7,8,1,3,4,5,6,73,2,3,4,5};
		
		Set<Integer> s=new HashSet<>();
		
		for(int i:arr)
		{
			if(s.add(i)==false)
			{
				System.out.println("duplicate elementsare "+i);
			}
		}
		
	}

}
