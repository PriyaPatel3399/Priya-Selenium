package org.testNG_FrameworkTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_Launching_CricBuzz
{
	@Test(invocationCount = 3)//to run test case 3 times
	public void launchApplication()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Navigated to CricBuzz application",true);// use to give info about test step in report, as well as Console also
		
		driver.quit();
		Reporter.log("Browser is closed", true);


	}
	

}
