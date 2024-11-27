package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_text_locatingEmailTextBox 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click(); //locating login linkText with By.xpath(),and click on it
		WebElement emailLabel = driver.findElement(By.xpath("//label[text()='Email:']")); //locating Email textBox with By.xpath()
		String  text = emailLabel.getText();
		System.out.println(text);
		
		/*2) xpath by text()------xpath("//tagnname[text()='visible_text']")--ex. //a[text()='Register']------linkText---
	 	                                                                                                                     //label[text()='Email:']---visibleText--
	 	                                       when we locate any text, we have to store it in WebElemnt, with its ref use .getText() store in in String, nd print it
	 	                                       if we want to locate from any parent tag, then use "." at the place of text()--ex. xpath(//parentTag[.='visible_text'])
	 	                                                                                                                                                                  ex.   //div[.='Register']                                                                          
	 	  */
	}
}
