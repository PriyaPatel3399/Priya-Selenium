package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_dep_Ind_locatingAddToCart 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();//locate Electronics link
		driver.findElement(By.partialLinkText("Cell phones")).click();//locate Cell phones link
		driver.findElement(By.xpath("//a[text() = 'Smartphone']/../..//input[@value='Add to cart']")).click();//locate add to cart
	}
}
