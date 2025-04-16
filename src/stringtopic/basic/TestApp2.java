package stringtopic.basic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name1= "royal";
		String name2= "royal";
		String name3= name1;
		String name4= "technosoft";
		
		// == reference
		System.out.println(name1==name2);// true
		System.out.println(name1==name3);// true
		System.out.println(name1==name4);// false
		
		System.out.println(name1.equals(name2));// true
		System.out.println(name1.equals(name3));// true
		System.out.println(name1.equals(name4));// false
		
//		System.out.println(name1+"----"+name1.hashCode());
//		System.out.println(name2+"----"+name2.hashCode());
//		System.out.println(name3+"----"+name3.hashCode());
//		System.out.println(name4+"----"+name4.hashCode());
	}
}
