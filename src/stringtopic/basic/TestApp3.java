package stringtopic.basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.println("name.length() : " + name.length());
		boolean flag= true;
		
		for (int i = 0 , j=(name.length()-1); i < name.length(); i++,j--) 
		{
			if (name.charAt(i)!=name.charAt(j)) 
			{
				flag= false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println("Name is Palindrome");
		} else 
		{
			System.out.println("Name is not Palindrome");
		}
	}
}
