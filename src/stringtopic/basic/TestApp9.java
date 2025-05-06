package stringtopic.basic;	

// 10. Print each character of a string on a new line.
public class TestApp9 
{
	public static void main(String[] args) 
	{
		
		String value = "This is Java";
		
		value = value.replace(' ', '-');
		
		System.out.println(value);
//		for (int i = 0; i < value.length(); i++) 
//		{
//			char v = value.charAt(i);
//			System.out.println(v); 
//		}
	}
}
