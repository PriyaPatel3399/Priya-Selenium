package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_FatchingTitleOfApp 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.purplle.com/");
	    /*1)get(String url)--void--navigate into an app  by using url OR launching the app using url in browser
		                           we have to pass fully qualified url ex(https://www.___.com/)   */
		
		String title = driver.getTitle();
		/* 2)getTitle()--String--use to get title of app, store it in string and print when want*/
		System.out.println(title);
	}
}
