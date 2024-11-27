package org.pop_Up_handling;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class To_lanchBrowser_in_MaximizedMode
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions options = new ChromeOptions();
  		options.addArguments("--incognito","--start-maximized"); //to launch broser in Incgonito mode, nd also open in maximized mode
		
  		WebDriver driver = new ChromeDriver(options);
  		driver.get("http://www.youtube.com/");
  		
  		driver.findElement(By.id("search")).sendKeys("tauba tauba", Keys.ENTER);
  		
	}

}
