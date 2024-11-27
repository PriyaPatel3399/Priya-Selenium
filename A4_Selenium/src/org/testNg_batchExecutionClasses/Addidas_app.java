package org.testNg_batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Addidas_app 
{
		@Test
		public void launchAdidas()
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.adidas.co.in/");
			Reporter.log("Adidas is Launched",true);// use to give info about test step in report, as well as Console also
		}

}
