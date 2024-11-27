package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws15_UpdateCustomerInfo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//login
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("priyapatel3399@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//update customer info
		driver.findElement(By.linkText("My account")).click();
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
		firstName.sendKeys("Priya R");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.linkText("Log out")).click();

	}
}
