package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_att_locatingEmail
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("piyupatel331999@gmail.com"); //locate an element by xpath with attribute
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234"); //locate an element by xpath with attribute
		
      /*1) xpath by attribute---xpath(//tagname[@attname='attvalue'])--ex. //input[@data-testid='royal_email'] 
                                                                                                                          //input[@placeholder='Email adress or phone number'] */
	 	                                                                                          
	}
}
