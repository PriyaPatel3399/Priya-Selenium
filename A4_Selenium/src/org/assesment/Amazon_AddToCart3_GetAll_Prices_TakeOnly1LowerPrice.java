package org.assesment;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddToCart3_GetAll_Prices_TakeOnly1LowerPrice 
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.amazon.in");

	WebElement searchbutton = driver.findElement(By.id("twotabsearchtextbox"));
	searchbutton.sendKeys("iphone 16");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (128 GB) - White']/../../../..//button[text()='Add to cart']")).click();
	driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (128 GB) - Pink']/../../../..//button[text()='Add to cart']")).click();
	driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (128 GB) - Black']/../../../..//button[text()='Add to cart']")).click();
	
	driver.findElement(By.id("nav-cart-count")).click();

	List<WebElement> allPrice = driver.findElements(By.className("sc-badge-price-to-pay"));
	Set<Double> finalPrices = new TreeSet();
	for(WebElement  price: allPrice)
	{
		String text =price.getText().replace(",", "");
		double rate = Double.parseDouble(text);
		finalPrices.add(rate);
	}
//	System.out.println(finalPrices);
	ArrayList<Double> al = new ArrayList(finalPrices);
	al.removeFirst();
	
	for(Double rate : al)
	{
		DecimalFormat formater = new DecimalFormat("#, ##0.00");
		String formatedAmount = formater.format(rate).trim();
		
		allPrice = driver.findElements(By.className("sc-badge-price-to-pay"));
		for(WebElement  price: allPrice)
		{
			String text =price.getText();
	//		System.out.println("text:"+text);
	//		System.out.println("formatedAmount: "+formatedAmount);

			if(text.contains(formatedAmount))
			{
				driver.findElement(By.xpath("//span[text()='"+formatedAmount+"']/../../../../../..//input[@value='Delete']")).click();
			}
		}
	}
}

}
