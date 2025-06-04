package collectionfrmwrk.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("rahul");
		queue.add("ankur");
		queue.add("sagar");
		queue.add("kunal");
		queue.add("jayant");
	
		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			System.out.println(name);
		}
	}
}
