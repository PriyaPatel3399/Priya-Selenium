package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_svgTag_locatingAddtocart 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 5000",Keys.ENTER); //locate searchbox pass data $ press enter
		driver.findElement(By.xpath("//div[text()='itel A23s (Coastel Gold, 32 GB)']/../../..//*[name()='svg']")).click();//loacte addtocart by mobile dependant
		/*when element is designed using svg tag then we ant locate it using xpath normally, we have to go with 2 finctions
		 1. name()---xpath("//*[name()='svg']")
		 2.local-name()---xpath("//*[local-name()='svg']")
		  		 */
	}

}
