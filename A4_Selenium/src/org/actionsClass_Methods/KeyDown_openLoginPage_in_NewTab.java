package org.actionsClass_Methods;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_openLoginPage_in_NewTab
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//syncronization,wait till 15 min to load elements, if loaded then move forward
		//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//we are not using this method now
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindowId = driver.getWindowHandle();
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(loginlink).perform();//press ctrl+ click login login link to open it in new tab
		
		//switching to another tab or windoe when we have 2 window Ids
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);//renove parentwindowid from set
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);//switch control to new opened tab
		}
	}
}
