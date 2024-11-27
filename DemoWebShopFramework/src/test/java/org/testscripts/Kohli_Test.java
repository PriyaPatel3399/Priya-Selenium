package org.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kohli_Test
{
	@Test(groups = {"india", "rcb" })
	public void launchKohli()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Virat_Kohli");
		Reporter.log("Kohli is Launched",true);
		driver.quit();
	}


}
