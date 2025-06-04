package iotopic.charorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		FileWriter fw = null;
		try 
		{
			fw = new FileWriter("royal2.txt");
			
			fw.write(name);
			System.out.println("success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
