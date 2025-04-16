package oops.actopic.interfacetopic.concept.task1;

// pure abstraction--100%
public interface A 
{
	// 1) Dm's---[public static final]---[constant variables]--CAPITAL
	
	int NO1 = 10;//public static final
	public int NO3 = 10;// static final
	final int NO4 = 10;//public static 
	static int NO5 = 10;//public final
	public static final int NO2 = 10;
	
	
	// 2) Mf's--
//		1) Abstract method-----[public abstract]
		void test1();// public abstract 
		public void test2();// abstract 
		abstract void test3();//public 
		public abstract void test4(); 
		
//		2) Non-Abstract method--
		
//		===>static(8),
		static void test5() 
		{
		}
//		===>default(8),
		default void test6() 
		{
			test7();
		}
//		===>private(9)
		private void test7() 
		{
		}
}
