package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_window 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/en.in"); //parent window
		String parentWindowId = driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB); //open new tab
		driver.get("https://jpmorgan.com/global");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open new windows
		driver.get("https://www.qspiders.com");
		
		driver.switchTo().window(parentWindowId); //switch to parent window
		
		/*c)window(String windowHandle)--WebDriver<<I>>--use to swith the window by passing windowId	 */
	}
}
