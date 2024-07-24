package practice45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listtrtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new ArrayList();
		
		
		l.add(23);
		l.add("ffrf");
		l.add(56);
		l.add("ftrg");
		l.add('c');
//		Iterator i=l.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		ListIterator li=l.listIterator();
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
//		while(li.hasPrevious())
//		{
//			System.out.println(li.previous());
//		}
		
		
	}

}
