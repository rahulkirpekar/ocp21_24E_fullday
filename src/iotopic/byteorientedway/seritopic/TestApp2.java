package iotopic.byteorientedway.seritopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ocp21_24E_fullday\\studentrcd.txt");

			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s[] = (Student[])oin.readObject();
		
			for (int i = 0; i < s.length; i++) 
			{
				s[i].disp();
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
