package practice45;

public class wordsreves {

	public static void main(String[] args) {
		
		String str="My name is lalmohan kumar";
		String[] str1=str.split(" ");
		
		String rev="";
		
		for(int i=str1.length-1;i>=0;i--)
		{
			rev=rev+str1[i]+" ";
		}
		System.out.println(rev);

	}

}
