package org.assesment;

import java.time.Duration;

import org.dataDrivenTesting.Read_Testdata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws1_Register 
{
	public static void main(String[] args) 
	{
		String url = Read_Testdata.readDataFromProperties("url");
		String gender = Read_Testdata.readDataFromExcel("RegisterCredentials", 1, 0);
		String firstName = Read_Testdata.readDataFromExcel("RegisterCredentials", 1, 1);
		String lastName = Read_Testdata.readDataFromExcel("RegisterCredentials", 1, 2);
		String email = Read_Testdata.readDataFromExcel("RegisterCredentials", 1, 3);
		String password = Read_Testdata.readDataFromExcel("RegisterCredentials", 1, 4);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//use data from Read_Testdata class
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
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		 driver.findElement(By.id("register-button")).click();
		 driver.close();
		 }

}
