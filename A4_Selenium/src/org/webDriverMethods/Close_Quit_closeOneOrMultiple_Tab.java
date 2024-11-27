package org.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit_closeOneOrMultiple_Tab
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.naukri.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get( "https://in.linkedin.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get( "https://www.foundit.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get( "https://in.indeed.com/");
		Thread.sleep(2000);
		driver.close();  //close one tab,where control is present
		Thread.sleep(2000);
		driver.quit(); //close or quit all the tab
		
		/*10)close()--void--use to cloe one tab, where control is present curruntly
		  11)quit()--void--use to close all opened tabs, 
		                   it also delete driver.exe file(of mini server) from the backend which is running in session, to improve speed of the server */
	}
}
