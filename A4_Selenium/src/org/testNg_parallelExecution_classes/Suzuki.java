package org.testNg_parallelExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Suzuki 
{
	@Test
	public void ciaz()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nexaexperience.com/ciaz");
		Reporter.log("Ciaz is Launched",true);// use to give info about test step in report, as well as Console also
		driver.quit();
	}
	
	@Test
	public void swift()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marutisuzuki.com/swift");
		Reporter.log("Swift is Launched",true);// use to give info about test step in report, as well as Console also
		driver.quit();
	}

}
