package org.assesment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mytra_loactingJeansPrice
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.myntra.com/");
			WebElement menlink = driver.findElement(By.xpath("//nav[@class='desktop-navbar']//a[text()='Men']"));//locate Men link
			WebElement jeans = driver.findElement(By.xpath("//nav[@class='desktop-navbar']//a[text()='Men']/..//a[text()='Jeans']"));//locate Jeans link

			Actions actions = new Actions(driver);
			actions.moveToElement(menlink).perform();
			actions.click(jeans).perform();
			List<WebElement> jeansPrice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
			for(WebElement x: jeansPrice)
			{
				String price = x.getText();
				System.out.println(price);
			}
	}
}
