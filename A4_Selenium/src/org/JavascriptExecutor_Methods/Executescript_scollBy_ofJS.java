package org.JavascriptExecutor_Methods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executescript_scollBy_ofJS 
{
	public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
	
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");//page will scroll by given amount from the line where is present now
			jse.executeScript("window.scrollTo(0,600)"); //page will scroll by given amount from starting point
	}

}
