package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws4_AddToCart 
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
		//add to cart
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		String actualText = driver.findElement(By.xpath("//p[@class='content']")).getText();
		String expectedText = "The product has been added to your shopping cart";
		if(actualText.contains(expectedText))
		{
			System.out.println("The product has been added to your shopping cart");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}
		driver.findElement(By.linkText("Log out")).click();

		 driver.close();
		
	}

}
