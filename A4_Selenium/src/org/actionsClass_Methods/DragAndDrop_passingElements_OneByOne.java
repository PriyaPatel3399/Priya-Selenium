package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_passingElements_OneByOne
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Actions actions = new Actions(driver);
			//locate all one by one and drag&drop
			for(int i = 1; i<=7;i++)
			{
			WebElement capital = driver.findElement(By.id("box"+i));//locate capital 
			WebElement country = driver.findElement(By.id("box10"+i));//locate country 
			
			actions.dragAndDrop(capital, country).perform();//drag nd drop from capital to country
			Thread.sleep(2000);
			}
	}
}
