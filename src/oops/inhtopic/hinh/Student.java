package oops.inhtopic.hinh;

public class Student extends Person
{
	int rno,std;
	public Student() 
	{
		System.out.println("Default Constructor Student");
	}
	public Student(int rno,String name, int std) 
	{
		super(name);
		System.out.println("Start - Para --Student");
		this.rno = rno;
		this.std = std;
		System.out.println("Exit - Para --Student");
	}
	public void dispStudent() 
	{
		System.out.println(rno+" " + name +" " + std);
	}
}
