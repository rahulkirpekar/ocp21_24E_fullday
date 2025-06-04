package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		FileInputStream fin = null;
		StringBuilder sb = new StringBuilder();
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ocp21_24E_fullday\\royal1.txt");
		
			int temp;
			
			while(	(temp = fin.read())	!= -1 ) 
			{
				sb.append((char)temp);
			}
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
				fin.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.print("Final String : " + sb);
	}
}
