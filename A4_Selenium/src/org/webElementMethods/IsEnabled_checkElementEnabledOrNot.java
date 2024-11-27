package org.webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_checkElementEnabledOrNot 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement textBox =  driver.findElement(By.xpath("//input[@class = 'form-control']"));
		if(textBox.isEnabled())
		{
			System.out.println("Text box is Enabled ");			
		}
		else
		{
			System.out.println("Text box is Disabled");
		}
	}
}
