package org.syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWait_inOrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//use syncriniztion

		WebElement usernameTextbox = driver.findElement(By.name("username"));//locate username 
		WebElement passwordTextbox = driver.findElement(By.name("password"));//locate password
		WebElement loginbutton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));//locate login button

		
		Actions actions = new Actions(driver);
		actions.sendKeys(usernameTextbox, "admin02").perform();//sending data by passing element ref and data, which we want to pass in element
		actions.sendKeys(passwordTextbox,"1234").perform();//sending data by passing element ref and data, which we want to pass in element
		actions.click(loginbutton).perform();//click o login bitton
	}
}
