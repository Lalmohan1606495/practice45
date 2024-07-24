package practice45;

import java.util.ArrayList;

public class commoneletwoarra {

	public static void main(String[] args) {
		
		
		int[] arr1= {2,3,4,5,6,7,8,9};
		int[] arr2= {2,5,7,11,55,66,77,65};
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					al1.add(arr1[i]);
			}
			
		}
		//for(int k:al1)
		
		
		
		System.out.println("common elements betwen two array is: "+al1);

	}

}
