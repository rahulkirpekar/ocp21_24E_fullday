package oops.inhtopic.si;

import java.util.Scanner;

// Employee IS-A Person // TRUE

// Child/Sub/Derived class
public class Employee extends Person
{
	// 1) Data Members
	int id,salary;
	String dsgn,orgname;
	
	// Para Contructor
	public Employee(int id,String name,int salary,String dsgn,String orgname)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dsgn=dsgn;
		this.orgname=orgname;
	}
	// Member function
	public void scanEmployee() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();		
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter OrgName : ");
		orgname = sc.nextLine();
	}
	public void dispEmployee() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + orgname);
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "Rahul Kirpekar", 1222, "SE", "Abc");

		e1.dispEmployee();
	}
}




