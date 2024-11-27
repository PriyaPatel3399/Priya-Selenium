package org.searchContextMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_findElements_loactingAddtocartButtons 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");//locate searchbox nd pass date
		driver.findElement(By.id("nav-search-submit-button")).click();//locate searchbutton nd click
		List<WebElement> addtocartButtons = driver.findElements(By.xpath("//button[text() = 'Add to cart']"));//locate all addtocart buttons
		System.out.println(addtocartButtons.size());//get size of all located elements
		for(WebElement x : addtocartButtons)
		{
			x.click();//click one by one on addtocart buttons
			Thread.sleep(2000);
		}
	}
}
