package org.webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_windowsByURL
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fosil.com/en-in/"); //parent window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String expectedUrl = "https://titan.co.in/";//store the expectedurl
		driver.switchTo().newWindow(WindowType.TAB); //open new tab
		driver.get("https://titan.co.in/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open new windows
		driver.get("https://www.fastrack.in/");
		Thread.sleep(2000);
		
		Set<String> allWindowUrls = driver.getWindowHandles(); //store diff windowIds in Set<String> collection,nd pass ref. in foreach loop
		for(String windowUrl : allWindowUrls)
		{
			driver.switchTo().window(windowUrl); //switch to dif windows one by one
			Thread.sleep(2000);
				String actualUrl = driver.getCurrentUrl();
				if(actualUrl.equals(expectedUrl))//match the actualurl with expected url by equals(), and stop the loop
				{
					break;
				}
		}
		/*c)window(String windowHandles)--WebDriver<<I>>--use to switch the all windows one by one, by passing dif windowIds stored in the Set<String>
		                                                  with the help of forEach loop	
		                                                  stop the loop at expected Url	 */
	}

}
