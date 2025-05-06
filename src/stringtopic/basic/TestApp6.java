package stringtopic.basic;

import java.util.Scanner;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Statement  : ");
		String stmt = sc.nextLine();
		
		
		for (int i = (stmt.length()-1); i >=0; i++) 
		{
			System.out.println(stmt.charAt(i));
		}
		
		int wc=0;
		
		String word = "";
		
		for (int i = 0; i < stmt.length(); i++) 
		{
			char value = stmt.charAt(i);
			if (value != ' ') 
			{
//				System.out.println("==>"+value);
				word = word.concat(value+"");
				wc++;
			} else 
			{
				System.out.println(word+" : " + wc+" characters.");
				wc=0;
				word = "";
			}
		}
		System.out.println(word+" : " + wc+" characters.");
	}
}