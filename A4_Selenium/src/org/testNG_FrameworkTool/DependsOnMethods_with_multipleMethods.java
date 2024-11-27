package org.testNG_FrameworkTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods_with_multipleMethods
{
	@Test
	public void RCB()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://www.royalchallengers.com/");
		Reporter.log("Navigated to RCB",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}
	@Test(dependsOnMethods = {"GT","MI"})
	public void CSK()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://www.chennaisuperkings.com/");
		Reporter.log("Navigated to CSK",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}
	@Test
	public void MI()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://www.mumbaiindians.com/");
		Reporter.log("Navigated to MI",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}
	@Test
	public void GT()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://www.gujarattitansipl.com/");
		Reporter.log("Navigated to GT",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}

}
