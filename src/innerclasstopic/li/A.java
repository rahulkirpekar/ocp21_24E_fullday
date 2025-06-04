package innerclasstopic.li;

public class A 
{
	private int no = 10;
	
	void disp() 
	{
		// Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println("NO : " + no);
			}
		}
		B b = new B();
		b.show();
	}
	
	public static void main(String[] args) 
	{
		A obj = new A();
		
		obj.disp();
	}
}