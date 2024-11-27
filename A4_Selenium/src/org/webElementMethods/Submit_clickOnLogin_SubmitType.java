package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_clickOnLogin_SubmitType 
{	
	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click(); //locating login link with By.linkText("Log in"),and click on it
			WebElement emailTextbox = driver.findElement(By.id("Email"));		
			emailTextbox.sendKeys("admin02@gmail.com",Keys.TAB,"Admin02", Keys.ENTER);//enter email, tab, enter password, enter
			driver.findElement(By.xpath("//input[@value = 'Log in']")).submit();//click on button,designed by using input tag & type='submit'---click() also work
	}
}
