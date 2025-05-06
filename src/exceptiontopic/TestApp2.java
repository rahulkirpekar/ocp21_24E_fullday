package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

 		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans ;
		
		try 
		{
			ans = no1 / no2;
			
		}catch(NullPointerException e) 
		{
			ans  = 0;
			System.out.println("Catch Block Handled Exception : "+ e.getMessage());
		}
		
		System.out.println("Addition : " + ans);
	}
}