package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_bypassing_attName 
{
	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click(); //locating login link with By.linkText("Log in"),and click on it
			WebElement emailTextbox = driver.findElement(By.id("Email"));	
			String email = "admin02@gmail.com";
			emailTextbox.sendKeys(email);//enter email
			String enteredEmail = emailTextbox.getAttribute("value");//get att value by passing attname
			System.out.println(enteredEmail);
			if(email.equals(enteredEmail))
			{
				System.out.println("Email entered Sucessfully");
			}
			else
			{
				System.out.println("Email is not entered properlly");

			}
	}


}
