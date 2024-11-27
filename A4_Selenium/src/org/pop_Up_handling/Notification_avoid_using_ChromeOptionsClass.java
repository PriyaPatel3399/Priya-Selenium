package org.pop_Up_handling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_avoid_using_ChromeOptionsClass 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions options = new ChromeOptions();
  		options.addArguments("--disable-notifications"); //to avoid geting notification pop-up in browser
		
  		WebDriver driver = new ChromeDriver(options);
  		
  		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.easemytrip.com/");
	}
}
