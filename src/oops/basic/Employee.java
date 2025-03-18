package oops.basic;

import java.util.Scanner;

public class Employee 
{
	int id;
	String name;
	int salary;
	String dsgn;
	String orgName;
	
	public void scanData() 
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
		orgName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" "+orgName);
	}
	
	public boolean isAvaibleByName(String searchName) 
	{
//		if(name.equals(searchName)) 
//		{
//			return true;
//		}
//		return false;
		
		return (name.equals(searchName)) ? true : false;
	}
	public boolean isAvaibleBySalary(int searchSalary) 
	{
		return (salary <= searchSalary) ? true : false;
	}
}






