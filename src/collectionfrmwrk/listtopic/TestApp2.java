package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> valueList = new ArrayList<Integer>();

		valueList.add(10);// AutoBoxing--[primitive to Integer Object]
		valueList.add(20);
		valueList.add(60);
		valueList.add(1230);
		valueList.add(4532);
		valueList.add(4323);
		valueList.add(87);
		
//		nameList.add("rahul");
//		nameList.add("ankur");
//		nameList.add("sagar");
//		nameList.add("kunal");
//		nameList.add("rakesh");
//		nameList.add("ramesh");
//		nameList.add("kunjan");
		
		Iterator<Integer> itr = valueList.iterator();

		while (itr.hasNext()) 
		{
			// Unboxing--[Integer Object to Primitive]
			int value = itr.next();
			
			System.out.println(value );
		}
	}
}
