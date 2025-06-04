package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("sagar");
		list.add("kunal");
		list.add("jayant");
		
//		Iterator<String> itr = 	list.iterator();
//		while (itr.hasNext()) 
//		{
//			String name = (String) itr.next();
//			System.out.println(name);
//		}
		
//		Stream<String> s =	list.stream();
//		s.forEach( name -> System.out.println(name) );
		
		list.stream().forEach( name -> System.out.println(name) );
		
		
//		list.stream().forEach(name-> System.out.println(name));
		
	}
}