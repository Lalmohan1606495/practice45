package practice45;

public class bublesort {

	public static void main(String[] args) {
		
		
		
		int[] arr= {3,1,6,2,77,4,55,98};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		// TODO Auto-generated method stub
for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]+" ");


System.out.println("Second highest element is "+arr[1]);

System.out.println(10+20+"javatpoint");
System.out.println("javapoint"+10+20+30);
System.out.println(10*20+"java");
System.out.println("javapoint"+10*20);
	}

}
