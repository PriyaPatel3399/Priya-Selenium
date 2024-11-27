package org.testNg_parallelExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hero
{
	@Test
	public void xtream200s4v()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/en-in/motorcycles/performance/xtreme-200s-4v.html");
		Reporter.log("xtream200s4v is Launched",true);// use to give info about test step in report, as well as Console also
		driver.quit();
	}

	@Test
	public void pleasure()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/en-in/scooters/pleasure-plus-xtec.html");
		Reporter.log("Pleasure is Launched",true);// use to give info about test step in report, as well as Console also
		driver.quit();
	}
	
	@Test
	public void splendor()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/en-in/motorcycles/practical/splendor-plus.htmll");
		Reporter.log("Splendor is Launched",true);// use to give info about test step in report, as well as Console also
		driver.quit();
	}
	
}
