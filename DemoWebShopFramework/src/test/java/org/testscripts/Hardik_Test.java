package org.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hardik_Test
{
	@Test(groups = {"india", "gt" })
	public void launchHardik()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Hardik_Pandya");
		Reporter.log("Hardik is Launched",true);
		driver.quit();
	}

}
