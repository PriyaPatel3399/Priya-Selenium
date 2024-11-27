package org.webDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size_position_of2window 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Dimension size1 = new Dimension(687,768);
		driver.manage().window().setSize(size1);
		Point position1 = new Point(-8,0);
		driver.manage().window().setPosition(position1);
		
	    driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Dimension size2 = new Dimension(687,768);
		driver.manage().window().setSize(size2);
		Point position2 = new Point(679,0);
		driver.manage().window().setPosition(position2);
		
	}


}
