package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_newWindow 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/virat.kohli/"); //parent window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB); //open new tab
		Thread.sleep(2000);
		driver.get("https://blinkit.com");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open new windows
		driver.get("https://www.zeptonow.com");
		
		driver.switchTo().newWindow(WindowType.TAB); //new tab open in parent window only,not in 2nd(last) windows opened
		driver.get("https://www.facbook.com");
		
		/*b)newWindow(WindowType typeHint)--WebDriver<<I>>--use to open new window or tab
		 *                                                  here, WindowType is an enum
		 *              TAB and WINDOW are static final veriable of windowtype enum                                   
		             (i)  newWindow(WindowType.TAB);--use to open new tab,we can open no.of new tab in parent window only, not in new created window
		             (ii) newWindow(WindowType.WINDOW);--use to open new window with one tab only, here we cannot open new tab
		 */
	}
}
