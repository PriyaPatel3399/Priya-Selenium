package org.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dws9_ReorderFromOrderlist
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//login
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("priyapatel331999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//Re-order fromorder list
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.xpath("//strong[text()='Order Number: 1813876']/../..//input[@value='Details']")).click();
		driver.findElement(By.xpath("//input[@value='Re-order']")).click();
		//checkout
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		WebElement billingAddressDD = driver.findElement(By.id("billing-address-select"));
		Select select1 = new Select(billingAddressDD);
		select1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		WebElement shippingAddressDD = driver.findElement(By.id("shipping-address-select"));
		Select select2 = new Select(shippingAddressDD);
		select2.selectByIndex(1);
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		String actualText = driver.findElement(By.xpath("//div[@class='title']")).getText();
		String expectedText = "Your order has been successfully processed!";
		if(actualText.contains(expectedText))
		{
			System.out.println("Your order has been successfully processed!");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}		
		driver.findElement(By.linkText("Log out")).click();

		 driver.close();



	}
}
