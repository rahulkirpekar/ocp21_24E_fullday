package stringtopic.basic;

public class TestApp5 
{
	public static void main(String[] args)  
	{
		//			   012345678901234567890112345678901234567890123456
//		String stmt = "This is Java which is developed by James Gosling";
//		String value1 = stmt.substring(8);
//		System.out.println("value1 : " + value1);
//		String value2 = stmt.substring(8, 12);
//		System.out.println("value2 : " + value2);
//----------------------------------------------------------------------------------------
		String name1= "royal";
		String name2= "royal";
		String name3= "technosoft";
		String name4= "ROYAL";
	
		
		if (name1.compareTo(name2) == 0) 
		{
			System.out.println("Both strings are same");
		} else 
		{
			System.out.println("Both strings are not same");
		}
		
//		System.out.println("name1.equals(name2) : " + name1.equals(name2));// true
//		System.out.println("name1.equals(name3) : " + name1.equals(name3));// false

//		System.out.println("name1.equals(name4) : " + name1.equals(name4));// false
//		System.out.println("name1.equalsIgnoreCase(name4) : "+name1.equalsIgnoreCase(name4));// true
	}
}
/*
	1) substring-one
	2) substring-two
	3) equals
	4) equalsIgnoreCase
	5) compareTo
	6) concat

*/