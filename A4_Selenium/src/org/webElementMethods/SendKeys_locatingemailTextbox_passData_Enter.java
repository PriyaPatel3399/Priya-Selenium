package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_locatingemailTextbox_passData_Enter
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click(); //locating login link with By.linkText("Log in"),and click on it
		WebElement emailTextbox = driver.findElement(By.id("Email"));		
		emailTextbox.sendKeys("admin02@gmail.com",Keys.TAB,"Admin02", Keys.ENTER);//enter email, tab, enter password, enter
	}
}
