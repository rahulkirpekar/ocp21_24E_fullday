package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
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
			try 
			{
				ans = no1 / no2;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				
				String name = "";
				System.out.println(name.length());// exception raise==>NullPointerException 
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name1 = "royal";
				System.out.println(name1.charAt(2));// ==>StringIndexoutofBoundException

			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			try 
			{
				int value = Integer.parseInt("1a23");
				System.out.println("value : " + value);
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
}
