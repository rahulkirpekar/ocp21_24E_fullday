package collectionfrmwrk.settopic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// HashSet
		// LinkedHashSet
		// TreeSet
		
//		HashSet<String> setObj = new HashSet<>();
//		LinkedHashSet<String> setObj = new LinkedHashSet<>();
		TreeSet<String> setObj = new TreeSet<>();

		setObj.add("rahul");
		setObj.add("sagar");
		setObj.add("suraj");
		setObj.add("kunal");
		setObj.add("rakesh");
		setObj.add("rahul");
		setObj.add("sagar");
		setObj.add("suraj");
		
		Iterator<String> itr = 	setObj.iterator();
		 while (itr.hasNext()) 
		 {
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
