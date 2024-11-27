package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Actions 
{
	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tinyurl.com/selenium-notes");
			WebElement introductionNotes = driver.findElement(By.xpath("//div[contains(text(),'Introduction to Automation')]"));//locate Introduction notes link
			
			Actions actions = new Actions(driver);
			//for left click
			actions.click(introductionNotes).perform();//click on indtroduction notes link,by passing elememnt ref.
			actions.moveToElement(introductionNotes).click().perform();//we can use this way also,first mousehover on it,then use click()
			
		}
}
