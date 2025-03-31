package oops.inhtopic.mli.test1;

public class A 
{
	int no1,no2,no3,no4,no5;
	
	A()
	{
		System.out.println("HI I am Default Constructor");
	}
	A(int no1)
	{
		this();
		this.no1=no1;
	}
	A(int no1,int no2)
	{
		this(no1);
		this.no2=no2;
	}
	A(int no1,int no2,int no3)
	{
		this(no1,no2);
		this.no3=no3;
	}
	A(int no1,int no2,int no3,int no4)
	{
		this(no1,no2,no3);
		this.no4=no4;
	}
	A(int no1,int no2,int no3,int no4,int no5)
	{
		this(no1,no2,no3,no4);
		this.no5=no5;
	}
	public void disp() 
	{
		System.out.println(no1+" "+ no2+" " + no3+" " + no4+" " + no5);
	}
	public static void main(String[] args) 
	{
		A obj = new A(10, 20, 30, 40, 50);
		
		obj.disp();
	}
}
