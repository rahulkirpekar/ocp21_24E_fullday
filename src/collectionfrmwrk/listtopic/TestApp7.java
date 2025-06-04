package collectionfrmwrk.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();

		list.add("rahul");
		list.add("sagar");
		list.add("kunal");
		list.add("rakesh");
		list.add("suraj");
		
		Iterator<String> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name );
		}
	}
}
