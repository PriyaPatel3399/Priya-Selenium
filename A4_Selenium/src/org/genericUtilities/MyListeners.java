package org.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners extends BaseClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("[Testcase--" + result.getName() + " started]",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("[Testcase--" + result.getName() + " success]",true);

	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("[Testcase--" + result.getName() + " failed]",true);

		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File realss = new File("./errorshots/"+ timeStamp +"screenshot.png");
		try {
			FileHandler.copy(screenshot, realss);
			}
			catch (IOException e) 
			{	e.printStackTrace();
			}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("[Testcase--" + result.getName() + " skipped]",true);

	}
	

}
