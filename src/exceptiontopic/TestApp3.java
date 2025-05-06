package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
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
			
			String name = "";
			System.out.println(name.length());// exception raise==>NullPointerException 
			
			String name1 = "royal";
			System.out.println(name1.charAt(2));// ==>StringIndexoutofBoundException

			int value = Integer.parseInt("1a23");
			System.out.println("value : " + value);
			
		}catch (ArithmeticException e) 
		{
			System.out.println("===> catch (ArithmeticException e)");
			e.printStackTrace();// display-->errorlog--[exception msg + rootcause]
		}
		catch (NullPointerException e) 
		{
			System.out.println("===> catch (NullPointerException e)");
			e.printStackTrace();// display-->errorlog--[exception msg + rootcause]
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("===> catch (StringIndexOutOfBoundsException e)");
			e.printStackTrace();// display-->errorlog--[exception msg + rootcause]
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Addition : " + ans);
	}
}