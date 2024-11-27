package org.testNG_FrameworkTool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods_LoginAndRegister_inDWS 
{
	String url = "https://demowebshop.tricentis.com/";
	String gender = "Male";
	String firstName = "Rohit";
	String lastName = "Sharma";
	String email = "rohitsharma4545@gmail.com";
	String password = "Rohit45";

	@Test
	public void register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();//click on register link
		 WebElement maleReadioButton = driver.findElement(By.id("gender-male"));
		 WebElement femaleReadioButton = driver.findElement(By.id("gender-female"));
		 if(gender.equalsIgnoreCase("Male"))
		 {
			 maleReadioButton.click();
		 }
		 else
		 {
			 femaleReadioButton.click();
		 }
		 driver.findElement(By.id("FirstName")).sendKeys(firstName);
		 driver.findElement(By.id("LastName")).sendKeys(lastName);
		 driver.findElement(By.id("Email")).sendKeys(email);
	//	 Assert.fail();---use to fail any testcase perposly
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		 driver.findElement(By.id("register-button")).click();
		 driver.findElement(By.linkText("Log out")).click();
				
	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//use data from Read_Testdata class
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
