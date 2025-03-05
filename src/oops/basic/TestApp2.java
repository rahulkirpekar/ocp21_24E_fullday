package oops.basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		int no;
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		s1.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s1.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s1.std = sc.nextInt();		
		
		System.out.println(s1.rno +" " + s1.name+" " + s1.std);
	}
}