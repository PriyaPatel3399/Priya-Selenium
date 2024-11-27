package org.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bumrah_Test 
{
	@Test(groups =  "mi" )
	public void launchBumrah()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Jasprit_Bumrah");
		Reporter.log("Bumrah is Launched",true);
		driver.quit();
	}

}
