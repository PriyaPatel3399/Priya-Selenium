package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_FatchingWindowHandleOfApp
{
	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //navigate into app
		
		String windowId = driver.getWindowHandle();
		/*5)getWindowHandle()--String--use to get the windowid, store it and print */
		System.out.println(windowId);
	}

}
