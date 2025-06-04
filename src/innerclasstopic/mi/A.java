package innerclasstopic.mi;

// Member Inner class
public class A 
{
	private int no = 100;
	class B
	{
		void show() 
		{
			System.out.println("NO : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB =	objA.new B();
		
		objB.show();
	}
}