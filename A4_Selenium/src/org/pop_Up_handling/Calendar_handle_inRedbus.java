package org.pop_Up_handling;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_handle_inRedbus
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.id("date-box")).click();//click on date box
		driver.findElement(By.xpath("//div[text()='October']/../..//span[text()='7']")).click();//select 7 date of october
	}
}
