package org.TakesScreenshot_Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureSSofWebpage
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);//capture ss tampapry,which remove when program execution ends
		
		File realss = new File("C:\\Users\\admin\\Desktop\\screenshot.png");//to take ss, use this way, take a desktop absolutepath and add \\screenshot.png
		File realscreenshot = new File(".\\errorshots\\screenshot.png");//to take ss, use this way, take a errorshots relativepath and add \\screenshot.png

		FileHandler.copy(screenshot, realss);//copy taken ss to see it on the desktop
		FileHandler.copy(screenshot, realscreenshot);//copy taken ss to see in errorshots folder(which is created inside selenium project)

	}
}
