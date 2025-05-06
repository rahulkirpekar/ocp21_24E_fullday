package exceptiontopic;

import java.util.Scanner;

class A
{
	 void test1() {}
}
class B extends A
{
	
	 void test2() {}

}
class C extends A{}

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A objA = new B();
		
//		objA.test2();//C.E
		
		B objB = (B)objA;// ClassCastException
		objB.test2();
//		Scanner sc = new Scanner(System.in);

/*		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1 / no2;
		System.out.println("Addition : " + ans);
*/
//		String name = null;
//		System.out.println(name.length());// NullpointerException
		
		
//		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
//		a[5] = 100;// ArrayIndexoutofBoundException
		
		
//		String name = "royal";
//		System.out.println(name.charAt(5));//StringIndexoutofBoundException
		
//		String value = "a1z2";
//		int no1 = Integer.parseInt(value);
		
	}
}
