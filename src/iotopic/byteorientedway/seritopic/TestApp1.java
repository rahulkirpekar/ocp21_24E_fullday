package iotopic.byteorientedway.seritopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		// s1--data---object---write---FileOutuStream
		
		// Auto Closable Resource
		try (
				FileOutputStream fout  = new FileOutputStream("studentrcd.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			) 
		{
			// java.io.NotSerializableException:
			out.writeObject(s);
			
			System.out.println("Success");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
