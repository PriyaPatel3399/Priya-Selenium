package org.testNg_groupExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rohit 
{
	@Test(groups = {"india", "mi" })
	public void launchRohit()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Rohit_Sharma");
		Reporter.log("Rohit is Launched",true);
		driver.quit();
	}

}
