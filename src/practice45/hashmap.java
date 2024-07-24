package practice45;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> hm=new HashMap();
		
		hm.put(101,"Lalmohan");
		hm.put(102, "nhjgkhkjg");
		hm.put(103, "fdg");
		
		for(Map.Entry me : hm.entrySet())
		{
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
