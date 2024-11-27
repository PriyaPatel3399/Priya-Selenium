package org.pop_Up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_sendKeys_handlePromptAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();//locate nd click on GetConformation button
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Priya");//to pass data in conformation alert
		
	}
}
