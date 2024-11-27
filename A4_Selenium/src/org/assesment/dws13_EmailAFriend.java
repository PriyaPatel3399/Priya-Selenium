package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws13_EmailAFriend 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//login
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("priyapatel331999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//email a friend
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.linkText("Build your own computer")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("rahulpatel9192@yahoo.com");
		driver.findElement(By.id("PersonalMessage")).sendKeys("Buy this product its nice");
		driver.findElement(By.xpath("//input[@value='Send email']")).click();
		String actualText = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent.')]")).getText();
		String expectedText = "Your message has been sent.";
		if(actualText.contains(expectedText))
		{
			System.out.println("Your message has been sent.");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}	
		driver.findElement(By.linkText("Log out")).click();

		 driver.close();

	}

}
