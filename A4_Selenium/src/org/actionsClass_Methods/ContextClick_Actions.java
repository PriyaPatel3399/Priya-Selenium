package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_Actions
{
	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ilovepdf.com/");
			WebElement mergePDF = driver.findElement(By.xpath("//h3[text()='Merge PDF']"));//locate merge pdf link
			//for right click
			Actions actions = new Actions(driver);
			
			actions.contextClick(mergePDF).perform();//right click on indtroduction notes link,by passing elememnt ref.
			actions.moveToElement(mergePDF).contextClick().perform();//we can use this way also,first mousehover on it,then use contextClick()
	}
}
