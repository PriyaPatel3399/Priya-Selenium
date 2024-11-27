package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_activeElement
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().activeElement().sendKeys("KGF chapter 2");
		
		/*switchTo()--TargetLocator<<I>>--use to switch the control
		 			a)activeElement()--WebElement<<I>>--use to transfer control to  active element
		 							(i)sendKeys(data)--use to pass the data to active textbox
		                            (ii)click()--use to click on active button
		 */
	}
}
