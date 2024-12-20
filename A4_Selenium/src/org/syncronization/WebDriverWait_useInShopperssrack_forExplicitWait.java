package org.syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWait_useInShopperssrack_forExplicitWait
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));//use syncriniztion implicitly
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		WebElement checkdeliveryTextbox = driver.findElement(By.id("Check Delivery"));//locate check delivery textbox
		WebElement checkButton = driver.findElement(By.id("Check"));//locte check button
		checkdeliveryTextbox.sendKeys("364001");
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));//give explicitwait till element displayed
		checkButton.click();
		}
}
