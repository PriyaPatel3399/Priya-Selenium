package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssS_loatingImg 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();//locate Electronics link
		driver.findElement(By.cssSelector("img[ title = 'Show products in category Cell phones']")).click(); //locate an img with By.cssSelector()
		driver.findElement(By.cssSelector("img[ title = 'Show details for Smartphone']")).click(); //locate an img with By.cssSelector()
		
		//locating img we are passing img tag with title attribute 
	}
}
