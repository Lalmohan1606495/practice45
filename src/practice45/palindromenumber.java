package practice45;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=4224;
		int r=0;
		int sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}

}
