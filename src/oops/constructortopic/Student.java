package oops.constructortopic;

public class Student 
{
	int rno;
	String name;
	int std;
	
	// Default Constructor
	Student()
	{
		System.out.println("START :: Default Constructor-----"+this);
		System.out.println("BEFORE INITIALISE :: " + rno+" " + name+" " + std);
		
		rno=1;
		name="rahul";
		std=12;

		System.out.println("AFTER INITIALISE :: " + rno+" " + name+" " + std);
		System.out.println("EXIT :: Default Constructor");
	}
	// Para Constructor--Two Arguments
	Student(int rno,String name)
	{
		System.out.println("START :: Two--PARA Constructor");
		System.out.println("BEFORE INITIALISE :: " + this.rno+" " + this.name+" " + this.std);

		this.rno=rno;
		this.name=name;
		
		System.out.println("AFTER INITIALISE :: " + this.rno+" " + this.name+" " + this.std);
		System.out.println("EXIT :: Two--PARA Constructor");
	}
	
	// Para Constructor--Three Arguments
	Student(int rno,String name,int std)
	{
		System.out.println("START :: Three--PARA Constructor");
		System.out.println("BEFORE INITIALISE :: " + this.rno+" " + this.name+" " + this.std);

		this.rno=rno;
		this.name=name;
		this.std=std;
		
		System.out.println("AFTER INITIALISE :: " + this.rno+" " + this.name+" " + this.std);
		System.out.println("EXIT :: Three--PARA Constructor");
	}
	
	// Copy Constructor
	public Student(Student s) 
	{
		System.out.println("START :: Copy Constructor-----"+this );
		System.out.println("BEFORE INITIALISE :: " + this.rno+" " + this.name+" " + this.std);

		rno = s.rno;
		name = s.name;
		std=s.std;
		
		System.out.println("AFTER INITIALISE :: " + this.rno+" " + this.name+" " + this.std);
		System.out.println("EXIT :: Copy Constructor");
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		Student s2 = new Student(s1);
		
		System.out.println("IN MAIN : " +s1.rno+" " + s1.name+" " + s1.std+"---"+s1);
		System.out.println("IN MAIN : " +s2.rno+" " + s2.name+" " + s2.std+"---"+s2);
	}
}