package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource_FatchingSourceCodeOfApp
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //navigate into app
		
        String pageSourceCode = driver.getPageSource();//getPageSourceCode()--String--use to get page sourcecode of app, store it and print
		
		System.out.println(pageSourceCode);
	}
}
