package org.JavascriptExecutor_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript_value_passData_inDisableTextbox_usingJS 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement disableTextbox = driver.findElement(By.xpath("//b[text()='Become a Subscriber']/../../..//input"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeAsyncScript("arguments[0].value='Priya'", disableTextbox);//pass data in disable textbox
		
	}
}
