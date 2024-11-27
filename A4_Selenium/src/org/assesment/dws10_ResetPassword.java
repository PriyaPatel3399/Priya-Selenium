package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws10_ResetPassword 
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
		//re-set password
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.linkText("Change password")).click();
		driver.findElement(By.id("OldPassword")).sendKeys("Password@123");
		driver.findElement(By.id("NewPassword")).sendKeys("Password@03");
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("Password@03");
		driver.findElement(By.xpath("//input[@value='Change password']")).click();
		String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
		String expectedText = "Password was changed";
		if(actualText.contains(expectedText))
		{
			System.out.println("Password was changed");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}
		 driver.close();

	}
}
