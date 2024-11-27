package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_locatingWlcome_text 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();//locate by linktext
		WebElement h1text = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));//locate by xpath--contains()
		String text = h1text.getText();
		System.out.println(text);//Welcome, Please Sign In!
		
		/* 3) xpath by contains()---xpath("//tagname[cotains(text(),'partial_Text')]")----for partial visibletext----                                                                                                                                                                                                                    
	 	                                            we have store in webElement, then getText() store in string nd print it            
		 		 */
	}
}
