package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement_bypassing_webElementRef 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement contactUsLink = driver.findElement(By.linkText("Contact Us"));//locate link
		
		Actions actions = new Actions(driver);
		
		actions.scrollToElement(contactUsLink).click(contactUsLink).perform();//scrolldown page till passed webelement ref., and click on it
	}

}
