package basic.arraytopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int b[] = new int[5];
		
		System.out.println("b int array obj : " + b);
		
		float a[] = new float[5]; // int a[5];

		System.out.println("a float array obj : " + a);
		
		
		//a[0],a[1],a[2],a[3],a[4]		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextFloat();
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}
