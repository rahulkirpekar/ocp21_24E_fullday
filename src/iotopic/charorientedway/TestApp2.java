package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\ocp21_24E_fullday\\royal2.txt");
			int temp ;
			while( (temp = fr.read()) != -1) 
			{
				char c = (char)temp;
				sb.append(c);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try {
				fr.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Final String : " + sb);
	}
}
