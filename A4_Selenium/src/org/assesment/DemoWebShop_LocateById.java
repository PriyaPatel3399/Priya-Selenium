package org.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_LocateById 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailTextBox = driver.findElement(By.id("Email")); //locate an element by using By.id()
		emailTextBox.sendKeys("piyu");  //check element locate or not pass data
		
		driver.findElement(By.id("Password")).sendKeys("1234"); //locate an element nd pass data
		
	}

}
