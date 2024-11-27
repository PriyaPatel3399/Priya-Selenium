package org.genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class BaseClass_DWS 
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
			System.out.println("Before Class");

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
		}
		@BeforeMethod
		public void loginToDWS()
		{
			//perform login in DWS
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("priyapatel331999@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Password@123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			}
		@AfterMethod
		public void logOutFromDWS()
		{
			//logout from DWS
			driver.findElement(By.linkText("Log out")).click();
		}
		@AfterClass
		public void tearDownBrowser()
		{
			System.out.println("After Class");
			//use to close the opened browser 
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
