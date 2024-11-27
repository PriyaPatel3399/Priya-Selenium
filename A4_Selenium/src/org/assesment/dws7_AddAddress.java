package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dws7_AddAddress 
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
		//add address
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("Rahul");
		driver.findElement(By.id("Address_LastName")).sendKeys("Patel");
		driver.findElement(By.id("Address_Email")).sendKeys("rahulpatel9192@yahoo.com");
		 WebElement countryDD = driver.findElement(By.id("Address_CountryId"));
		 Select select = new Select(countryDD);
		 select.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("Pune");
		driver.findElement(By.id("Address_Address1")).sendKeys("A2-23,Mahalaxmi complex");
		driver.findElement(By.id("Address_Address2")).sendKeys("KAspate wasti,wakad");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("411057");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9988776655");
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("098765456786");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='My account - Addresses']")).getText();
		String expectedText = "My account - Addresses";
		if(actualText.contains(expectedText))
		{
			System.out.println("The product has been added to Addresses list");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}	
		driver.findElement(By.linkText("Log out")).click();

		 driver.close();

	}
}
