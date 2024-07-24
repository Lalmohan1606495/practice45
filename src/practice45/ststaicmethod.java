package practice45;

public class ststaicmethod {
	//using static method
	/*static void show()
	{
		System.out.println("in static method");
	}*/
	//without static method
	void show2()
	{
		System.out.println("without static mmethod");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //ststaicmethod.show();
		ststaicmethod ob=new ststaicmethod();
		ob.show2();
	}

}
