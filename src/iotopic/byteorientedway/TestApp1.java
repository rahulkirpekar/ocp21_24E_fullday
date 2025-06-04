package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		//string---byte
		byte b[] = name.getBytes();
		
		FileOutputStream fout = null;
		try 
		{
			fout = new FileOutputStream("royal1.txt");
			
			fout.write(b);
			
			System.out.println("Success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
