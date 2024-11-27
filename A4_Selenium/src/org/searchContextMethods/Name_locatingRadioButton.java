package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_locatingRadioButton
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.name("Gender")).click(); //locating gender radio buttonr with By.name("Gender"),and click on radio button
		
		//Here, we have 2 radio button with same name "Gender", so it will select first radio button
		//to avoid that, we have to go for another attribute other than name
	}
}
