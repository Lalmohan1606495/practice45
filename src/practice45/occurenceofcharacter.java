package practice45;

import java.util.HashMap;
import java.util.Map;

public class occurenceofcharacter {

	public static void main(String[] args) {
		getcharacterocurence("LALMOHANKUMAR");
		//getcharacterocurence("this is test of java");

	}
	public static void getcharacterocurence(String name)
	{
		HashMap<Character,Integer> hm=new HashMap();
		
		char[] arr=name.toCharArray();
		
		for(char c:arr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		//System.out.println(name+":"+hm);
		for(Map.Entry me:hm.entrySet())
		{
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
	
	}


