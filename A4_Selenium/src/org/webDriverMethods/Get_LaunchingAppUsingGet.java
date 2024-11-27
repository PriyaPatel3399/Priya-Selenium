package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_LaunchingAppUsingGet 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
	    /*get(String url)--void--use to navigate into an app  by using url OR launching the app using url in browser
		                         we have to pass fully qualified url ex(https://www.zomtao.com/) othervise we will get InvalidArgumentException */
	}

}
