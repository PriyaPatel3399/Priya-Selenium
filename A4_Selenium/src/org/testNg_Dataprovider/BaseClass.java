package org.testNg_Dataprovider;

import java.time.LocalDateTime;

import org.element_repository.BasePage;
import org.element_repository.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
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

public class BaseClass{
	/*implements IAutoConstants, ITestListener{
}

		public static WebDriver driver;
		public FileLibrary flib;
		public BasePage bp;
		public LoginPage lp;
		
		@BeforeSuite
		public void beforeSuite() {
			Reporter.log("Before Suite", true);
		}
		@BeforeTest
		public void beforeTest() {
			Reporter.log("Before Test", true);
		}
		@AfterSuite
		public void afterSuite() {
			Reporter.log("After Suite", true);
		}
		@AfterTest
		public void afterTest() {
			Reporter.log("After Test", true);
		}
		@Parameters("bname")
		@BeforeClass
		public void launchingBrowser(@Optional("chrome") String browserName) {
			
			Reporter.log("Before class", true);
			if(browserName.equalsIgnoreCase("chrome"))
				driver=new ChromeDriver();
			else if(browserName.equalsIgnoreCase("edge"))
				driver=new ChromeDriver();
			else if(browserName.equalsIgnoreCase("firefox"))
				driver=new ChromeDriver();
			bp = new BasePage(driver);
			lp = new LoginPage(driver);
			flib =new FileLibrary();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
		}
		@AfterClass
		public void tearDownBrowser() {
			Reporter.log("After class", true);
			driver.close();
			driver.quit();
		}
		@BeforeMethod
		public void navigateAndLoginToDWS() {
			Reporter.log("Before method", true);
			Object propertyFilePath;
			driver.get(flib.fetchDataFromProperties(propertyFilePath, "url"));
			lp.getLoginLink().click();
			lp.getEmailTextBox().sendKeys(flib.fetchDataFromProperties(propertyFilePath, "email"));
			lp.getPasswordTextBox().sendKeys(flib.fetchDataFromProperties(propertyFilePath, "password"));
			lp.getLoginButton().click();
			
		}
		@AfterMethod
		public void afterMethod() {
			Reporter.log("After method", true);
			lp.getLogoutLink().click();
		}
		
		@Override
		public void onTestStart(ITestResult result) {
			Reporter.log("[ Testcase --"+result.getName()+"-- is started]");
		}
		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("[ Testcase --"+result.getName()+"-- is passed]");
		}
		@Override
		public void onTestFailure(ITestResult result) {
			Reporter.log("[ Testcase --"+result.getName()+"-- is failed]");
			LocalDateTime ldt=LocalDateTime.now();
			String time=ldt.toString().replace(":", "-");
			TakesScreenshot ts =(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("//errorshots"+"screenshot"+time+".png");
			try {
				FileHandler.copy(src, dest);
			} catch (Exception e) {
				
			}
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("[ Testcase --"+result.getName()+"-- is skipped]");
		}
		@Override
		public void onStart(ITestContext context) {
			Reporter.log("[ <test> --"+context.getName()+"-- is started]");
		}
		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("[ <test> --"+context.getName()+"-- is finished]");
		}
		
		*/
	}

