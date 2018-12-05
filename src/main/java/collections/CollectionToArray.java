package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import static java.lang.System.out;

public class CollectionToArray {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("haha");
		al.add("heyhey");
		
		Object[] a1 = al.toArray();
		out.println(a1[0]);
		
		String[] a2 = al.toArray(new String[0]);
		out.println(a2[0]);
		
		for(String element: al)
		{
			out.println(element);
		}
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			out.println(iterator.next());
		}
		
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasPrevious())
		{
			out.println(listIterator.previous());
		}
	}
	
}
