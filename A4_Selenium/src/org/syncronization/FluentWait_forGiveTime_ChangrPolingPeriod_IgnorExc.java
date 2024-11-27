package org.syncronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait_forGiveTime_ChangrPolingPeriod_IgnorExc 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));//use syncriniztion implicitly
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		//for explicitlywait
		WebElement checkdeliveryTextbox = driver.findElement(By.id("Check Delivery"));//locate check delivery textbox
		WebElement checkButton = driver.findElement(By.id("Check"));//locte check button
		checkdeliveryTextbox.sendKeys("364001");
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));//give explicitwait till element displayed
		checkButton.click();
		//for fluent wait
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		fw.withTimeout(Duration.ofSeconds(15));//give time to wait
		fw.pollingEvery(Duration.ofMillis(250));//change polling period
		fw.until(ExpectedConditions.elementToBeClickable(checkButton));//give fluent wait condition
		fw.ignoring(NoSuchElementException.class);//to ignore exception
		}

}
