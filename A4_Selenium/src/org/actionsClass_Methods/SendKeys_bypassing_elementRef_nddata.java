package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_bypassing_elementRef_nddata
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement usernameTextbox = driver.findElement(By.name("username"));
		WebElement passwordTextbox = driver.findElement(By.name("password"));

		
		Actions actions = new Actions(driver);
		actions.sendKeys(usernameTextbox, "admin02").perform();//sending data by passing element ref and data, which we want to pass in element
		actions.moveToElement(passwordTextbox).sendKeys("1234").perform();//first moveToElement() then,pass data by sendKeys(data)
	}

}
