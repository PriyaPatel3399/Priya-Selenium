package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_FatchingCurrentUrlOfAp
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //to navigate to app
		
		String currentUrl = driver.getCurrentUrl();  //getCurrentUrl()--String--use to get current url of app, store it and print
		
		System.out.println(currentUrl);
	
	}

}
