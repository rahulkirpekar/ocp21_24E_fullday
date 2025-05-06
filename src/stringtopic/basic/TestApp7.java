package stringtopic.basic;

public class TestApp7 
{
	/**
	 * 
	 * This is Testing for comment
	 * 
	 * @since v1.45
	 * 
	 */
	static void test1() 
	{
		System.out.println("egfm");
	}
	public static void main(String[] args) 
	{
		test1();
		//			   012345678901234567
		String stmt = "This is Java which is developed by Java James Gosling";
		
//		boolean flag = stmt.startsWith("This");
//		System.out.println("flag = " + flag);
		
		
//		System.out.println("stmt.indexOf(\"Java\") : "+stmt.indexOf("Java"));
//		System.out.println("stmt.lastIndexOf(\"Java\") : "+stmt.lastIndexOf("Java"));

//		boolean flag = stmt.contains("java");
//		System.out.println("flag : " + flag);
		
//		boolean flag = 	stmt.endsWith("Java");
//		System.out.println("flag = " + flag);
		
//		String value = stmt.toLowerCase();
//		System.out.println("value : " + value);
//		value = stmt.toUpperCase();
//		System.out.println("value : " + value);
		
		char v[] = stmt.toCharArray();
		System.out.println("v.length : " +v.length);
		for (char c : v) 
		{
			System.out.println(c);
		}
	}
}
