package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TeestApp3 
{
	public static void main(String[] args) 
	{
		// TestApp2.java---read---write---TestAppClone.java
		
		FileInputStream fin = null;
		FileOutputStream fout  = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ocp21_24E_fullday\\src\\iotopic\\byteorientedway\\TestApp2.java");
			fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\ocp21_24E_fullday\\src\\iotopic\\byteorientedway\\TestAppClone.java");
			
			int temp;
			
			while((temp = fin.read()) != -1)
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
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
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
