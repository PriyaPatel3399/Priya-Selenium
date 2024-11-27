package org.pop_Up_handling;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class To_lanchBrowser_in_IncognitoMode 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions options = new ChromeOptions();
  		options.addArguments("--incognito"); //to launch broser in Incgonito mode
		
  		WebDriver driver = new ChromeDriver(options);
  		driver.get("http://www.youtube.com/");
  		
	}
}
