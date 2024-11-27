package org.TakesScreenshot_Methods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ss_using_LocalDateTime
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		LocalDateTime ldt = LocalDateTime.now();//we don't hve constructor of this class to create obj, so we have to go with now() method
																				//now()--is factory method, which returns the obj of LocalDateTime class,
																								//now() is overridden by toString(), thats why it give us current time date & time ,when we print ref.
		String timeStamp = ldt.toString().replaceAll(":", "-");//toString() to convert ldt into String formate, replaceAll(()--to replace : with - in given string
																																										   //because : not work in path for concat string
		WebDriver driver = new ChromeDriver();      
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);//capture ss tampapry,which remove when program execution ends
		
		File realscreenshot = new File(".\\errorshots\\"+timeStamp+"screenshot.png");//concat timeStamp in path, for store file with uniqe date nd time

		FileHandler.copy(screenshot, realscreenshot);//copy taken ss to see in errorshots folder(which is created inside selenium project)

	}
}
