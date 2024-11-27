package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Release_actions 
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
			WebElement cat = driver.findElement(By.id("box1"));//locate cat
			WebElement dropbox = driver.findElement(By.id("dropBox"));//locate dropbox
			
			Actions actions = new Actions(driver);
			actions.clickAndHold(cat).moveToLocation(39, 30).pause(2000).perform();//click nd hold, and move it
			actions.release(dropbox).perform();//rlease it at target element
			
			//	actions.moveToElement(cat).clickAndHold().moveToLocation(39, 30).pause(2000).perform();//first mousehover,then click nd hold, and move it
			//actions.moveToElement(dropbox).release().perform();//first mousehover,then rlease it at target element
			

			//locate all one by one, do clickandhold & then release
			for(int i = 2; i<=4;i++)
			{
			WebElement animal = driver.findElement(By.id("box"+i));//locate capital 
			WebElement dropBox = driver.findElement(By.id("dropBox"));//locate country 
			
			actions.clickAndHold(animal).release(dropBox).perform();//drag nd drop from capital to country
			Thread.sleep(2000);
			
			}

	}
}
