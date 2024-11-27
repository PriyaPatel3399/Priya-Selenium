package org.dataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_login_usingTestdata_ofProperties
{
	public static void main(String[] args) throws InterruptedException 
	{
		//fetch data from Properties file with help of Read_Testdata class
		String url = Read_Testdata.readDataFromProperties("url");
		String email = Read_Testdata.readDataFromProperties("email");
		String password = Read_Testdata.readDataFromProperties("password");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//use data from Read_Testdata class
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
