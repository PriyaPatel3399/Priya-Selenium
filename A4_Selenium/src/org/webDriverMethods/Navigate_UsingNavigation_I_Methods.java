package org.webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_UsingNavigation_I_Methods
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //navigate into app
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/");
		
		Navigation navi = driver.navigate();
		
		 navi.back();
		 Thread.sleep(5000);
		 navi.forward();
		 Thread.sleep(5000);
		 driver.navigate().refresh();
		 Thread.sleep(5000);
		 driver.navigate().to("https://www.zomato.com/");
		 Thread.sleep(5000);
		 URL url = new URL("https://www.purple.com/");
		 navi.to(url);
		 /*7)navigate()--Navigation<<I>>--use to perform browser history actions, store it and use reference of <<I>> ex navi.back()
                                                                                  use directly with method chaining   ex driver.navigate().back()
											for this use metthod of Navigation <<I>>
											back()--use to move to previous page
											forward()--use to move to next page
											refresh()--use to refresh current page
											to(String url)--use to navigate into app like get(url)method
											to(URL url)--Store in url type and use reference or else driver.to(new URL("pass url here")) */
	}
}
