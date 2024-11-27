package org.pop_Up_handling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_handle_inOmayo
{
	public static void main(String[] args) throws  InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("uploadfile")).click();//click on uploadfile button
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\admin\\Documents\\FileUpload1.exe");
	}
}
