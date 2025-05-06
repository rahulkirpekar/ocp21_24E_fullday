package stringtopic.basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestApp8 
{
	public static void main(String[] args) 
	{
//		String value = " ";
//		boolean flag = value.isEmpty();
//		System.out.println("flag : " + flag);// 
//		flag = value.isBlank();
//		System.out.println("flag : " + flag);// 
		
		LocalDate date1 = LocalDate.now(); 
		LocalDate date2 = LocalDate.of(6, 20, 2014);  
		LocalDate date3 = LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE); 
		
		System.out.println(date1); 
		System.out.println(date2); 
		System.out.println(date3); 
	}
}