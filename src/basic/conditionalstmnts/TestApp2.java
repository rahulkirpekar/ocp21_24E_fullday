package basic.conditionalstmnts;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		System.out.println("Enter below choice : ");
		System.out.println(" plus) For Addition");
		System.out.println("2) For Subtraction");
		System.out.println("3) For Multiply");
		System.out.println("4) For Division");
//		char choice = sc.next().charAt(0);
		String choice = sc.next();
		switch(choice) 
		{
			case "plus": ans = no1+no2;
					System.out.println("Addition : " + ans);
					break;
			case "-": ans = no1-no2;
					System.out.println("Subtraction : " + ans);
					break;
			case "*": ans = no1*no2;
					System.out.println("Multiply : " + ans);
					break;
			case "/": ans = no1/no2;
					System.out.println("Division : " + ans);
					break;
			default:
					System.out.println("Invalid Choice,\n\t Please enter between 1o t 4 choice");
		}
	}
}
