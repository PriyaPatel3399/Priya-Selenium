package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText_locatingMobiles_Link 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.linkText("Mobiles")).click(); //locating Mobiles link,and click on it
		driver.findElement(By.partialLinkText("MOTOROLA Edge 50")).click(); //locating motorola link in Mobiles page by partiallink,and click on it
	}	
}
