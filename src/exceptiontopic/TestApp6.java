package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp6 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// InvalidAgeException--[Custom Exception]--checked Exception===>Exception
			// raise exception--throw
			throw new InvalidAgeException("\n\t\"Invalid Age,\n\t\tPlease enter greater than 18 Age.\"");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		try 
		{
			isValidForVote(age);
			
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
	}
}
