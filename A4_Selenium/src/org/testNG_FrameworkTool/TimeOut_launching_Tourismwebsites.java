package org.testNG_FrameworkTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_launching_Tourismwebsites 
{
	@Test(enabled = false)//use to disable this testcase
	public void karnataka()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://karnatakatourism.org/");
		Reporter.log("Navigated to Karnataka Tourism",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}
	@Test(timeOut = 9000)//use to give time limit to testcase
	public void maharashtra()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://maharashtratourism.gov.in/");
		Reporter.log("Navigated to Maharastra Tourism",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}
	@Test
	public void tamilnadu()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched");//use to give info about test steps in report
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://www.tamilnadutourism.tn.gov.in//");
		Reporter.log("Navigated to Tamilnadu Tourism",true);// use to give info about test step in report, as well as Console also
		driver.quit();
		Reporter.log("Browser is closed", true);
	}

}
