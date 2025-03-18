package oops.encaptopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
//		s1.rno = 1;
//		s1.name = "rahul";
//		s1.std = 12;

		s1.setRno(1);
		s1.setName("rahul");
		s1.setStd(12);
		
		
		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
	}
}
