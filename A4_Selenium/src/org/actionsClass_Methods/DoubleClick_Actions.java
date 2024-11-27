package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Actions
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(3000);
			WebElement doubleClickbutton = driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]"));//locate double click here button
			Actions actions = new Actions(driver);
			//for double click
			actions.doubleClick(doubleClickbutton).perform();//double click on doubleClickbutton button,by passing elememnt ref.
		//	actions.moveToElement(doubleClickbutton).doubleClick().perform();//we can use this way also,first mousehover on it,then use doubleClick()
	}
}
