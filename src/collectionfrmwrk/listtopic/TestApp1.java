package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		 ArrayList listObj = new ArrayList();
		
		 listObj.add(true);// 0-- boolean--true---store as object in listObject   <===itr
		 listObj.add(12);// 1 int 12 value as object
		 listObj.add('r');// 2 character--values as object
		 listObj.add(1456L);// 3Long objects
		 listObj.add(12.21f);// 4 Float object
		 listObj.add(4532.2134);// 5 Double Object
		 listObj.add("royal");// 6 String as object
		 
		 Student s= new Student(1,"kunal",12);
		 listObj.add(s);// 7
		 
		 System.out.println("listObj.size() : "   + listObj.size());

//		 System.out.println("listObj.get(1) : " + listObj.get(1));// 12
		
/*
  		 for (int i = 0; i < listObj.size(); i++) 
		 {
			 Object obj = listObj.get(i);
			 
			 if (obj instanceof Student) 
			 {
				 Student s1 = (Student)obj;
				 System.out.print("listObj.get("+i+") : ");
				 s1.dispData();
			} else 
			{
				System.out.println("listObj.get("+i+") : " + listObj.get(i));// true 
			}
		 }
		 ------------------------------------------------------------------------------------------------------------
		 // ForEach / Advanced for loop / Enhanced for..loop
		 for (Object obj : listObj) 
		 {
			 if (obj instanceof Student) 
			 {
				 Student s1 = (Student)obj;
				 s1.dispData();
			 } else 
			 {
				 System.out.println(obj);
			 }	
		 }
		------------------------------------------------------------------------------------------------------------
 */
		 
		 Iterator itr =	listObj.iterator();
		 
		 while(itr.hasNext()) 
		 {
			 Object obj = itr.next();

			 if (obj instanceof Student) 
			 {
				 Student s1 = (Student)obj;
				 s1.dispData();
			 } else 
			 {
				 System.out.println(obj);
			 }	
		 }
	}
}











