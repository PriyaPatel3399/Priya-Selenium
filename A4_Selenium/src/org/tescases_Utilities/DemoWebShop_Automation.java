package org.tescases_Utilities;

import org.genericUtilities.BaseClass_DWS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.genericUtilities.My_Listeners_DWS.class)
public class DemoWebShop_Automation extends BaseClass_DWS
{
	@Test(priority = 1)
	public void addToWishlist()
	{
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top JR Plus')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		String actualText = driver.findElement(By.xpath("//p[@class='content']")).getText();
		String expectedText = "The product has been added to your wishlist";
		if(actualText.contains(expectedText))
		{
			System.out.println("The product has been added to your wishlist");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}
	}
 
	@Test(priority = 2)
	public void addToCart()
	{
				//add to cart
				driver.findElement(By.partialLinkText("JEWELRY")).click();
				driver.findElement(By.linkText("Black & White Diamond Heart")).click();
				driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
				
				driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top')]")).click();
				driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

				String actualText = driver.findElement(By.xpath("//p[@class='content']")).getText();
				String expectedText = "The product has been added to your shopping cart";
				if(actualText.contains(expectedText))
				{
					System.out.println("The product has been added to your shopping cart");
				}
				else
				{
					System.out.println("Something went wrong check again");
				}
				driver.findElement(By.linkText("Log out")).click();
	}
 
	@Test(priority = 3)
 	public void addToCompareList()
 	{
 		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.linkText("Build your own computer")).click();
		driver.findElement(By.xpath("//input[@class='button-2 add-to-compare-list-button']")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Compare products']")).getText();
		String expectedText = "Compare products";
		if(actualText.contains(expectedText))
		{
			System.out.println("The product has been added to Compare list");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}
 	}
 
	@Test(priority = 4)
 	public void addAddress()
 	{
 		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("Rahul");
		driver.findElement(By.id("Address_LastName")).sendKeys("Patel");
		driver.findElement(By.id("Address_Email")).sendKeys("rahulpatel9192@yahoo.com");
		 WebElement countryDD = driver.findElement(By.id("Address_CountryId"));
		 Select select = new Select(countryDD);
		 select.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("Pune");
		driver.findElement(By.id("Address_Address1")).sendKeys("A2-23,Mahalaxmi complex");
		driver.findElement(By.id("Address_Address2")).sendKeys("KAspate wasti,wakad");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("411057");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9988776655");
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("098765456786");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='My account - Addresses']")).getText();
		String expectedText = "My account - Addresses";
		if(actualText.contains(expectedText))
		{
			System.out.println("The product has been added to Addresses list");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}	
 	}
 	
	@Test(priority = 5)
 	public void Checkout()
 	{
 		//checkout process
 				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
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
 	}
 
	@Test(priority = 6)
 	public void reOrderFromOrderlist()
 	{
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
 	}
	
	@Test(priority = 7)
 	public void updateCart()
 	{
 		//update shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();
		WebElement quantity = driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top')]/../..//input[@class='qty-input']"));
		quantity.clear();
		quantity.sendKeys("3");
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
 	}
 	
	@Test(priority = 8)
 	public void removeFromProductFromWishlist()
 	{
 		driver.findElement(By.linkText("Wishlist")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top')]/../..//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@value='Update wishlist']")).click();
		
 	}
 
	@Test(priority = 9)
 	public void removeProductFromShoppingcart()
 	{
 		//remove product from shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot Top')]/../..//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
 	}
 	
	@Test(priority = 10)
 	public void emailAFriend()
 	{
 		//email a friend
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.linkText("Build your own computer")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("rahulpatel9192@yahoo.com");
		driver.findElement(By.id("PersonalMessage")).sendKeys("Buy this product its nice");
		driver.findElement(By.xpath("//input[@value='Send email']")).click();
		String actualText = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent.')]")).getText();
		String expectedText = "Your message has been sent.";
		if(actualText.contains(expectedText))
		{
			System.out.println("Your message has been sent.");
		}
		else
		{
			System.out.println("Something went wrong check again");
		}	
 	}
 	
 	@Test(priority = 11)
 	public void updateCustomerInfo()
 	{
 		//update customer info
 				driver.findElement(By.linkText("My account")).click();
 				WebElement firstName = driver.findElement(By.id("FirstName"));
 				firstName.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
 				firstName.sendKeys("Priya R");
 				driver.findElement(By.xpath("//input[@value='Save']")).click();
 	}
	
}
