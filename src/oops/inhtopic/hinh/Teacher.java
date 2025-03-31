package oops.inhtopic.hinh;

public class Teacher extends Person
{
	int classTeacherstd;
	String dsgn;
	
	public Teacher() 
	{
		System.out.println("Default Constructor Teacher");
	}
	public Teacher(int classTeacherstd,String name , String dsgn) 
	{
		this.classTeacherstd = classTeacherstd;
		this.name = name;
		this.dsgn = dsgn;
	}
	public void dispTeacher() 
	{
		System.out.println(classTeacherstd+" " + name +" " + dsgn);
	}
}