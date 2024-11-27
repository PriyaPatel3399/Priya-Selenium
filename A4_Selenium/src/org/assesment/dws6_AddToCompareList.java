package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws6_AddToCompareList 
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
		//add to compare list
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.linkText("Build your own computer")).click();
		driver.findElement(By.xpath("//input[@class='button-2 add-to-compare-list-button']")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Compare products']")).getText();
		String expectedText = "Compare products";
		if(actualText.contains(expectedText))
		{
			System.out.println("The product has been added to Compare list");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}
		driver.findElement(By.linkText("Log out")).click();

		 driver.close();

		
	}


}
