package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName_locating_searchBox_getItsTagname
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 16",Keys.ENTER);//locate searchbox nd enter
		WebElement price = driver.findElement(By.xpath("//span[text() = 'Apple iPhone 15 (256 GB) - Green']/../../../..//span[@class='a-price-whole']"));//locate mobile
		System.out.println("Price: "+price.getText());//get price by using getText()
	}
}
