package practice45;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,1,3,4,5,3,6,7,8,9};
		int firstlarge=0;
		int secondlarge=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>firstlarge)
			{
				secondlarge=firstlarge;
			firstlarge=a[i];
		}
		}
  System.out.println(firstlarge+" "+secondlarge);
	}

}
