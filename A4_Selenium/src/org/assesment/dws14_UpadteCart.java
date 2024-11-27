package org.assesment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws14_UpadteCart 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//login
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("priyapatel3399@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//update shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();
		WebElement quantity = driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top')]/../..//input[@class='qty-input']"));
		quantity.clear();
		quantity.sendKeys("3");
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		driver.findElement(By.linkText("Log out")).click();

	}

}
