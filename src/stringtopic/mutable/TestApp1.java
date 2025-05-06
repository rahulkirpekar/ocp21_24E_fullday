package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// String----X---reverse()------>StringBuilder/StringBuffer
		// String--concate()---->append()--->StringBuilder/StringBuffer
		
		// Mutable Operation
		
		// 1) StringBuilder(Not Implemented MultiThreadding)
		StringBuilder sb = new StringBuilder("Royal");
		System.out.println(sb+"---"+sb.hashCode());
		sb.append(" Technosoft");
		System.out.println(sb+"---"+sb.hashCode());
		
		// 2) StringBuffer(Multi Threadding)
//		StringBuffer sb = new StringBuffer("Royal");
//		System.out.println(sb+"---"+sb.hashCode());
//		sb.append(" Technosoft");
//		System.out.println(sb+"---"+sb.hashCode());
	}
}