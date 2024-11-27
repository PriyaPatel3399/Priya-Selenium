package org.testNg_crossBrowserExecution_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Execution 
{
	@Parameters("browser")//use to pass parameter to testNg @method--add this annotation after generating testNg xml class only
	@Test
	public void launchBrowser(@Optional("chrome")  String browserName)//@Optional("chrome")--use to pass default value
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
	}
	
/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser name:");
		String browserName = sc.next();
		
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
		
	}
 
 */
}
