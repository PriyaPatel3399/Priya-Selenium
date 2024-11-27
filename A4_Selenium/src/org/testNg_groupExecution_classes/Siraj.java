package org.testNg_groupExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Siraj
{
	@Test(groups =  "rcb" )
	public void launchSiraj()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Mohammed_Siraj");
		Reporter.log("siraj is Launched",true);
		driver.quit();
	}

}
