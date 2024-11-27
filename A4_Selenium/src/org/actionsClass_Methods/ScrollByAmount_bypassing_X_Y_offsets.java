package org.actionsClass_Methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount_bypassing_X_Y_offsets
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ferrerorocher.com/in/en/");
		
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 900).perform();//scroll page by passing offsets, For most websites we can scroll down only(not rightside) so pass only y offset
	}
}
