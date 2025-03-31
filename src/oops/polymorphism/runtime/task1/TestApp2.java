package oops.polymorphism.runtime.task1;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// early / static/compiletime  binding
		
		Person person = null;
		
		// Student
		// Upcasting---[Polymorphic object]
		// Runtime Polymorphism
		person = new Employee(); // new Employee();
		person.getPlaceByBehaviour();
		
		
//		person.getResult();//C.E
		
		// Downcasting
		Student s = (Student)person;// ClassCastException
		s.getResult();
		
		
		// Employee
//		person = new Employee();
//		person.getPlaceByBehaviour();
				
		
		// Citizen
//		person = new Citizen();
//		person.getPlaceByBehaviour();
						
	}
}
