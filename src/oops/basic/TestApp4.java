package oops.basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Employee e[] = new Employee[5];
		
		for (int i = 0; i < e.length; i++) 
		{
			e[i] = new Employee();
			e[i].scanData();
		}
		for (int i = 0; i < e.length; i++) 
		{
			e[i].dispData();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name which you want to Search : ");
		String searchName = sc.nextLine();
		boolean flag = true;
		for (int i = 0; i < e.length; i++) 
		{
			if (e[i].isAvaibleByName(searchName)) 
			{
				flag = false;
				e[i].dispData();
				break;
			}
		}
		if (flag) 
		{
			System.out.println("Given "+searchName+" Employee record not found in Array");
		} 		
		System.out.println("-----------------------------");
		
		System.out.println("Enter Salary which you want to Search : ");
		int searchSalary = sc.nextInt();
		flag = true;
		for (int i = 0; i < e.length; i++) 
		{
			if (e[i].isAvaibleBySalary(searchSalary)) 
			{
				flag = false;
				e[i].dispData();
			}
		}
		if (flag) 
		{
			System.out.println("Given "+searchSalary+" Employee record not found in Array");
		} 		
	}
}