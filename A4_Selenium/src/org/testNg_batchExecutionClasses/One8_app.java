package org.testNg_batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class One8_app 
{
	@Test
	public void launchOne8()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.one8.com/");
		Reporter.log("One8 is Launched",true);// use to give info about test step in report, as well as Console also
	}

}
