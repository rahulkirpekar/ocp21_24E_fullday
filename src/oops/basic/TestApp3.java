package oops.basic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		
//		s[1] = new Student();
//		s[2] = new Student();
//		s[3] = new Student();
//		s[4] = new Student();
		
		for (int i = 0; i < s.length; i++) 
		{
			// i---0--s[0]=student object
			s[i] = new Student();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();

		// s1--scan---scanData()
		
//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
//		s4.scanData();
		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
//		s4.dispData();
		
/*		
		System.out.println("s1 : " + s1.toString());
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3.toString());
		
		Scanner sc = new Scanner(System.in);
		
		// s1--scan--[rno name std]
		System.out.println("Enter Rno : ");
		s1.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s1.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s1.std = sc.nextInt();		
		
		// s2---scan--[rno name std]
		System.out.println("Enter Rno : ");
		s2.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s2.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s2.std = sc.nextInt();		
		
		
		// s3---scan--[rno name std]
		System.out.println("Enter Rno : ");
		s3.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s3.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s3.std = sc.nextInt();		

		// s4---scan--[rno name std]
		System.out.println("Enter Rno : ");
		s4.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s4.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s4.std = sc.nextInt();		

		
		System.out.println(s1.rno+" " + s1.name+" " + s1.std);
		System.out.println(s2.rno+" " + s2.name+" " + s2.std);
		System.out.println(s3.rno+" " + s3.name+" " + s3.std);
		System.out.println(s4.rno+" " + s4.name+" " + s4.std);
*/		
		
	}
}
