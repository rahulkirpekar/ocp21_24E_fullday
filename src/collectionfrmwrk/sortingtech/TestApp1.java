package collectionfrmwrk.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// list		set			queue					   map
		//  |	  TreeSet	   PriorityQueue  			TreeMap  
		
		
		
//		Collection---interface
//		Collections---class
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);//0
		list.add(6);//1
		list.add(12);//2
		list.add(4);//3
		list.add(20);//4
		
		
		Iterator<Integer>  itr =	list.iterator();

		while (itr.hasNext()) 
		{
			Integer value = itr.next();
			System.out.println(value);
		}
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		
		itr =	list.iterator();

		while (itr.hasNext()) 
		{
			Integer value = itr.next();
			System.out.println(value);
		}
		
	}

}
