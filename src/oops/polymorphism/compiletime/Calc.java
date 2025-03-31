package oops.polymorphism.compiletime;

public class Calc 
{
	public void addFun(double no1,double no2) 
	{
		System.out.println("Two(double) Args : " + (no1+no2));
	}
	public void addFun(long no1,long no2) 
	{
		System.out.println("Two(long) Args : " + (no1+no2));
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("Three Args : " + (no1+no2+no3));
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("Four Args : " + (no1+no2+no3+no4));
	}
	public void addFun(int no1,int no2,int no3,int no4,int no5) 
	{
		System.out.println("Five Args : " + (no1+no2+no3+no4+no5));
	}
	public static void main(String[] args) 
	{
		Calc calc = new Calc();

		calc.addFun('a', 'b');
		
	}
}
/*
	1) argument count
	2) excat DataType
	3) Type Pramotion Rule

Type Pramotion Rule:-
-----------------------

boolean--[true/false]---X

				
						byte
						 |	
						short
						 |			
	char--------------->int					
						 |			
						long 
						 |	
						float 		
						 |	
						double 		

*/