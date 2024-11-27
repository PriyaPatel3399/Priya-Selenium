
package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws3_ForgotPassword 
{
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("priyapatel331999@gmail.com");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("Email")).sendKeys("priyapatel331999@gmail.com");
		driver.findElement(By.xpath("//input[@name='send-email']")).click();
		 String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
		String expectedText = "Email with instructions has been sent to you.";
		if(actualText.contains(expectedText))
		{
			System.out.println("forgot password link has been sent");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}
		driver.findElement(By.linkText("Log out")).click();

		 driver.close();

		
	}

}
