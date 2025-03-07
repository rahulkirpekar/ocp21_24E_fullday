package oops.basic;

import java.util.Scanner;

//  Object(Cosmic Super class)
//    |
//  Student
public class Student 
{
	// 1) Dm's
	int rno,std;
	String name;
	// 2) Mf's
	
	// 3) main methods
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();	
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
}

//System--public final class
//out---PrintStream class object
//println();---PrintStream class Overloadded methods
//System.out.println();
