package org.testNg_crossBrowserExecution_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Faasos
{
	@Parameters("browser")//use to pass parameter to testNg @method--add this annotation after generating testNg xml class only
	@Test
	public void launchFaasos( @Optional("chrome") String browserName)//@Optional("chrome")--use to pass default value
	{                                                                                                                      //add it after creating TestNg xml class
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();//to launch chrome 
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();//to launch firefox
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();//to lauch edge
		}
		else
		{
			System.out.println("Invalid Browser");//here we will get nullPointerException
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.faasos.com/");
		Reporter.log("Fassos is launched");
		driver.quit();
	}
	
	

}
