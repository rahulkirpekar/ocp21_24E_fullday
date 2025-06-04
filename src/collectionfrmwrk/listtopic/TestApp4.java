package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);//0
		list.add(6);//1
		list.add(12);//2
		list.add(4);//3
		list.add(20);//4
		
//		System.out.println(list);
		
		Iterator<Integer>  itr =	list.iterator();

		while (itr.hasNext()) 
		{
			Integer value = itr.next();
			System.out.println(value);
		}
//		list.set(2, 1200);
		
		list.remove(1);
		System.out.println("--------------");
		itr =	list.iterator();

		while (itr.hasNext()) 
		{
			Integer value = itr.next();
			System.out.println(value);
		}		
	}
}
