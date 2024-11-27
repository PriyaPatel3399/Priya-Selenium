package org.pop_Up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_getText_handleAnyAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		Actions actions = new Actions(driver);
		actions.contextClick().perform();//to rigthclick on the page,to get alert pop-up
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();//to get text present in pop-up
		System.out.println(text);
		alert.accept();//click on OK button of alert pop-up
	}

}