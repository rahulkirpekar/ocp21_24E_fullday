package oops.polymorphism.runtime.task1;
import java.util.Scanner;
public class TestApp1 
{
	public void getPlace(Person person) 
	{
		person.getPlaceByBehaviour();
		
		if(person instanceof Student) // true
		{
			// Downcasting
			Student s = (Student)person;
			s.getResult();
			
		}else if(person instanceof Employee) // true
		{
			// Downcasting
			Employee e = (Employee)person;
			e.getSalary();
		}
		else if(person instanceof Child) // true
		{
			// Downcasting
			Child c = (Child)person;
			c.getMovieOnTime();
		}
		else if(person instanceof Citizen) // true
		{
			// Downcasting
			Citizen ci = (Citizen)person;
			ci.getPublicEvent();
		}
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Student Behaviour");
		System.out.println("2) For Employee Behaviour");
		System.out.println("3) For Citizen Behaviour");
		System.out.println("4) For Child Behaviour");
		int choice = sc.nextInt();
		
		switch(choice) 
		{
			case 1: Student s = new Student();
					obj.getPlace(s);
					break;
					
			case 2: Employee e = new Employee();
					obj.getPlace(e);
					break;
					
			case 3: Citizen c = new Citizen();
					obj.getPlace(c);
					break;
					
			case 4: Child child = new Child();
					obj.getPlace(child);
					break;
		}
	}
}
