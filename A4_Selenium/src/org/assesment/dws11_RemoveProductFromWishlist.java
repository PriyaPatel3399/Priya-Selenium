package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws11_RemoveProductFromWishlist 
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
		//remove product from wishlist
		driver.findElement(By.linkText("Wishlist")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top')]/../..//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@value='Update wishlist']")).click();
		
		driver.findElement(By.linkText("Log out")).click();

	}
}
