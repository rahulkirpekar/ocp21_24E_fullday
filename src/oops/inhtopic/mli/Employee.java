package oops.inhtopic.mli;

public class Employee extends Person
{
	int id,salary;
	
	public Employee(int id,String name,int salary) 
	{
		super(name);
		this.id = id;
		this.salary = salary;
	}
}
