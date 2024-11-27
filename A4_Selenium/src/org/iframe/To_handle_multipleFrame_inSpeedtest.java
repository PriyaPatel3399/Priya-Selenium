package org.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_handle_multipleFrame_inSpeedtest
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.speedtest.net/");
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		WebElement frame = driver.findElement(By.xpath("(//iframe)[3]"));
		driver.switchTo().frame(frame);//switch control to iframe by passing webelement
		
		driver.findElement(By.xpath("(//iframe)[2]//*[name()='svg']")).click();//click on close button of iframe/add
	}
}
