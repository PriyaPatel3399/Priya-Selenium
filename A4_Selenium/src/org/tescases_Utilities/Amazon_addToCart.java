package org.tescases_Utilities;

import java.util.Set;
import org.genericUtilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.genericUtilities.MyListeners.class)
public class Amazon_addToCart extends BaseClass
{
	@Test
	public void addToCart()
	{
		driver.get("https://www.amazon.in");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("brain",Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Brain model removable in 4 parts')]")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		for(String x : allWindowId)
		{
			driver.switchTo().window(x);
		}
		driver.findElement(By.id("add-to-cart-button")).click();
	//	Assert.fail();
	}

}