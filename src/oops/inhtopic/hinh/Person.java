package oops.inhtopic.hinh;

public class Person 
{
	String name;
	Person()
	{
		System.out.println("Default Constructor Person");
	}
	Person(String name)
	{
		this();
		System.out.println("Start - Para --Person");
		this.name = name;
		System.out.println("Exit - Para --Person");

	}
}
