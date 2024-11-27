package org.testNg_groupExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jadeja 
{
	@Test(groups =  "csk" )
	public void launchJadeja()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Ravindra_Jadejai");
		Reporter.log("Jadeja is Launched",true);
		driver.quit();
	}

}
