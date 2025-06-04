package iotopic.byteorientedway.seritopic;

import java.io.Serializable;
import java.util.Scanner;


// Serializable --- Marker/Tagged Interface---
		//	JVM---Flag set---Student--Object---
				// file write--help JVM to write object into file
public class Student implements Serializable
{
	private int rno     ;
	private String name ;
	private int std     ;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
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
}
