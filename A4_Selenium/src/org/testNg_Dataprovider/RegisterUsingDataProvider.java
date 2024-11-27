package org.testNg_Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUsingDataProvider
{
	@Test(dataProvider = "REGISTER", dataProviderClass = org.genericUtilities.DataProviderClass.class)
	public void register(String gender,String firstname, String lastname, String email, String password) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
