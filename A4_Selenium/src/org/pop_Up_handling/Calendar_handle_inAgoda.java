package org.pop_Up_handling;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_handle_inAgoda 
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		int year = ldt.getYear();
		String month = ldt.getMonth().name();//fatch presnt month, nd covert it into String by using name()---OCTOBER
		String start = month.substring(0, 1).toUpperCase();//take first letter, convert into uppercase---O
		String end = month.substring(1).toLowerCase();//take rest all letters, convert it into lowercase---ctober
		month = start+end;//to get month like October as per the website
		int date = ldt.getDayOfMonth();//fatch todays date
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
		
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();//click on date box
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+date+"']")).click();//select todays date, by unsing dynamic xpath
		
		
	}

}
