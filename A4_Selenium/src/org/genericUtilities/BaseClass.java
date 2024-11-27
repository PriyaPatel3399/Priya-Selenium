package org.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass
{
	
	 public static WebDriver driver = null;//create global variable as public to use it in whole class, nd dif package also

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	
	}
	//use to write logic for lauch nd maximized the browser---by using crossBrowser execution logic
	@Parameters("browserName")
	@BeforeClass 
	public void launchAndMaximizedBrowser( @Optional("chrome") String browserName)
	{
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
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	//use to close the opened browser 
	@AfterClass
	public void tearDownBrowser()
	{
		driver.close();
		driver.quit();
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
}
