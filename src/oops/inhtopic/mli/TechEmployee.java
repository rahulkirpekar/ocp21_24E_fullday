package oops.inhtopic.mli;

public class TechEmployee extends Employee
{
	String dsgn;
	
	
	public TechEmployee(int id,String name,int salary) 
	{
		super(id,name,salary);
	}
	
	public TechEmployee(int id,String name,int salary,String dsgn) 
	{
		super(id,name,salary);
		this.dsgn=dsgn;
	}
	public void disp() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn);
	}
}
