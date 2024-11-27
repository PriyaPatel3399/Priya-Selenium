package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_loacatingEmailTextBox 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextBox = driver.findElement(By.id("email")); //locate an element by using By.id()
		emailTextBox.sendKeys("piyu");  //check element locate or not pass data
		
		driver.findElement(By.id("pass")).sendKeys("1234"); //locate an element nd pass data
		
		/*1) id(String id)--use to locate an element base on id
		                    ctrl + f--to search id with #id (ex. #email) in html code,and give it in findElement( By.id(email) )
	                        check element located or not, we can pass the data in sendKeys(string) method    */
	}

}
