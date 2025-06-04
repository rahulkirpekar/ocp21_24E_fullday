package collectionfrmwrk.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		
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
