package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_locatingLoginLink
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click(); //locating login link with By.linkText("Log in"),and click on it
		
		/*3)linkText(String linktext)--By--use to locate an element with link 
		 *                                 by passing linktext( text present between <a>___</a> )
		 * we have to take linktext, which don't have space at start & end of the linkText
		 */
	}	
}
