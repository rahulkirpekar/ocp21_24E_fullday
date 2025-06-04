package innerclasstopic.ni;

public class A 
{
	private static int no = 100;
	
	// Nested Innerclass
	static class B
	{
		void show() 
		{
			System.out.println("NO : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		
		obj.show();
		
	}
}
