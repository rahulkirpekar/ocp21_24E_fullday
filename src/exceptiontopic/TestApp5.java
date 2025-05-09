package exceptiontopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = 0 ;
		try 
		{
			ans = no1 / no2;
		}catch (NullPointerException e) 
		{
			e.printStackTrace();
		}	
		finally 
		{
			// database connection close/
			// socket connection close/
			// IO(file) connection  close
			System.out.println("finally block---Hello IMP code");
		}
		System.out.println("General Stateement");
	}
}