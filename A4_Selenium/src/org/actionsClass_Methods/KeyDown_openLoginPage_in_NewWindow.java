package org.actionsClass_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_openLoginPage_in_NewWindow
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindowId = driver.getWindowHandle();
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).click(loginlink).perform();//press shift+ click login login link to open it in new window
		actions.keyUp(Keys.SHIFT).perform();//release pressed key of keyDown()
		
		//switching to another tab or windoe when we have 2 window Ids
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);//renove parentwindowid from set
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);//switch control to new opened tab
		}
	}

}
