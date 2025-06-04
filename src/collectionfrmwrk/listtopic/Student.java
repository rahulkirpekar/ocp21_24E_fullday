package collectionfrmwrk.listtopic;

public class Student 
{
	int rno;
	String name;
	int std;
	public Student(int rno, String name, int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std );
	}
}
