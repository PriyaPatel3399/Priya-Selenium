package org.webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_windowsByTitle
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://cadburygifting.in/"); //parent window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String expectedTitle = "KitKat";//store expected title
		driver.switchTo().newWindow(WindowType.TAB); //open new tab
		driver.get("https://www.kitkat.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open new windows
		driver.get("https://www.ferrerorocher.com/in/en/");
		Thread.sleep(2000);
		
		Set<String> allWindowIds = driver.getWindowHandles(); //store diff windowIds in Set<String> collection,nd pass ref. in foreach loop
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId); //switch to dif windows one by one
			Thread.sleep(2000);
				String actualTitle = driver.getTitle();
				if(actualTitle.contains(expectedTitle))//match the actualtitle with expected title by contains(), and stop the loop
				{
					break;
				}
		}
		/*c)window(String windowHandles)--WebDriver<<I>>--use to switch the all windows one by one, by passing dif windowIds stored in the Set<String>
		                                                  with the help of forEach loop		 */
	}

}
