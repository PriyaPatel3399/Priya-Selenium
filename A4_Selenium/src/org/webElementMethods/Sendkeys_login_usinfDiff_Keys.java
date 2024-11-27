package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_login_usinfDiff_Keys 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click(); //locating login link with By.linkText("Log in"),and click on it
		WebElement emailTextbox = driver.findElement(By.id("Email"));		
		emailTextbox.sendKeys("admin02@gmail.com",Keys.CONTROL + "a");//enter email, nd select it
		Thread.sleep(2000);
		emailTextbox.sendKeys(Keys.CONTROL + "c");//copy selected email
		Thread.sleep(2000);
		emailTextbox.sendKeys(Keys.TAB,Keys.CONTROL + "v");//tab to move in pass box, paste pass
		Thread.sleep(2000);
		emailTextbox.clear();//clear emaill


		

	}
}
