package org.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dhoni_Test
{
	@Test(groups = {"india", "csk" })
	public void launchDhoni()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/MS_Dhoni");
		Reporter.log("Dhoni is Launched",true);
		driver.quit();
	}

}
