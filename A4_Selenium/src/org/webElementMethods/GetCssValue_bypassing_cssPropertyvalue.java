package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue_bypassing_cssPropertyvalue 
{
	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click(); //locating login link with By.linkText("Log in"),and click on it
			driver.findElement(By.id("Email")).sendKeys("amnin02",Keys.TAB);	//pass wrong id & press  tab
			WebElement errorMsg = driver.findElement(By.xpath("//span[text() = 'Please enter a valid email address.']"));//locate erroe msg
			String color = errorMsg.getCssValue("color");//get cssvalue by passing property name
																						//we can choose css property by locating first nd then take property from Filter
			System.out.println(color);
	}
}
