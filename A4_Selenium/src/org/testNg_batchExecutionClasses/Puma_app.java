package org.testNg_batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puma_app 
{
	@Test
	public void launchPuma()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.inpuma.com/in/en/");
		Reporter.log("Puma is Launched",true);// use to give info about test step in report, as well as Console also
	}

}
