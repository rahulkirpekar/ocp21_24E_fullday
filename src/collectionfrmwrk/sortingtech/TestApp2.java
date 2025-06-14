package collectionfrmwrk.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "rahul", 12);
		Student s2= new Student(2, "ankur", 9);
		Student s3= new Student(3, "rakesh", 6);
		Student s4= new Student(4, "sagar", 11);
		Student s5= new Student(5, "jaimin", 10);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			s.dispData();
		}
		
		Collections.sort(list, new StdWiseStudentComparator());
		
		System.out.println("After StdWise Sorting : ");
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			s.dispData();
		}
		
		Collections.sort(list, new NameWiseStudentComparator());
		
		System.out.println("After NameWise Sorting : ");
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			s.dispData();
		}
	}
}
