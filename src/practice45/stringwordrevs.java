package practice45;

public class stringwordrevs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Hello World";
		
		String[] split=s.split(" ");
		String rev="";
		for(int i=split.length-1;i>=0;i--)
		{
			rev=rev+split[i]+" ";
		}
		System.out.println(rev);
	}

}
