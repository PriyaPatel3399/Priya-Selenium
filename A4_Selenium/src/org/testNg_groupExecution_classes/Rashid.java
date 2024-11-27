package org.testNg_groupExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rashid 
{
	@Test(groups =  "gt" )
	public void launchBumrah()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Rashid_Khan");
		Reporter.log("Rashid is Launched",true);
		driver.quit();
	}

}
