package org.genericUtilities;

import java.time.Duration;

import org.element_repository.BasePage;
import org.element_repository.LoginPage;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(org.genericUtilities.MyListeners.class)//to listen our testscript,take ss on failure
public abstract class BaseClass implements FrameworkConstants
{
	
	 public static WebDriver driver;//create global variable as public to use it in whole class, nd dif package also
	 public BasePage basepage; //to get longin link from basepage
	 public LoginPage loginpage; //to get login componant from loginpage
	 public Read_Testdata readtestdata; //to fatch data from readtestdata
	 
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
	}
	@BeforeMethod
	public void loginToApplication()
	{
		basepage = new BasePage(driver);
		readtestdata= new Read_Testdata();
		String url = readtestdata.readDataFromProperties("url");
		String email = readtestdata.readDataFromProperties("email");
		String password = readtestdata.readDataFromProperties("password");

		driver.get(url);
		loginpage = new LoginPage(driver);
		loginpage.login(email, password);
	}
	@AfterMethod
	public void logoutFromApplication()
	{
		loginpage.logout();
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
