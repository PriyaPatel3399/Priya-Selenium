package org.pop_Up_handling;

import java.time.LocalDateTime;

public class Todays_Date
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		int year = ldt.getYear();//fatch present year
		System.out.println(year);
		
		 String month = ldt.getMonth().name();//fatch presnt month, nd covert it into String by using name()
		 System.out.println(month);
		String start = month.substring(0, 1).toUpperCase();//take first letter, convert into uppercase
		String end = month.substring(1).toLowerCase();//take rest all letters, convert it into lowercase
		month = start+end;
		System.out.println(month);//concate both to get full month
		 
		int date = ldt.getDayOfMonth();//fatch todays date
		System.out.println(date);
		
		String xpath = "//div[text()='"+month+"']/../..//span[text()='"+date+"']";
		System.out.println(xpath);
		
	}

}
