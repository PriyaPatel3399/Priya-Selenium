package org.pop_Up_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_PopUp
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/admin/Downloads/popup.html");
		String parentId = driver.getWindowHandle();//store parent windowId

		driver.findElement(By.id("PopUp")).click();//locate html pop-up, nd click
	
		Set<String> allWindowIds = driver.getWindowHandles();//store all windowIds
		allWindowIds.remove(parentId);//remove parentId from allIds
		//switch control to another window,for that traverse set with for-each-loop to get  windowId
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);//switch control to new opened window(child-window pop-up)
		}
		driver.close();//to close child window
	}

}
