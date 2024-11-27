package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Dependant_locatingAddToCartButton
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");//locate searchbox nd pass date
		driver.findElement(By.id("nav-search-submit-button")).click();//locate searchbutton nd click
		driver.findElement(By.xpath("//span[text() = 'Apple iPhone 16 (512 GB) - Teal']/../../../..//button[text() = 'Add to cart']")).click();//locate add to cart by xpath dependant independant
		
	}

}
