package collectionfrmwrk.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashMap<Integer, String> mapObj = new HashMap<>();
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<>();
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
		mapObj.put(11, "rahul");// ENTRY-->[KEY,VALUE]
		mapObj.put(2, "ankur");
		mapObj.put(30, "rakesh");
		mapObj.put(42, "kunal");
		mapObj.put(59, "ramesh");

		for(Map.Entry<Integer, String> e :	mapObj.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
