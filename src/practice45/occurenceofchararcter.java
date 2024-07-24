package practice45;

import java.util.HashMap;
import java.util.Map;

public class occurenceofchararcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="occurneceofchrarcter";
		
		char[] str1=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap();
		
		for(char ch:str1)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
			hm.put(ch, 1);
			}
				
		}
	for(Map.Entry me:hm.entrySet())
		System.out.println(me.getKey()+":"+me.getValue());

	}

}
