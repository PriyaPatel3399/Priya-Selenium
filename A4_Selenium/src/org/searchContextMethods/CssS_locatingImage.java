package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssS_locatingImage
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.cssSelector("img[alt='Nord 4']")).click();
	
		//cssSelector()--to locate img we have to pass img tag with alt attribute
	}

}
