package org.pop_Up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class To_handle_SimpleAlert_inDemoQA 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15));//use to avoid noAlertPresentException,bcz we get alert after some time
		driver.get("http://demoqa.com/alerts");
		
		 WebElement clickMeButton = driver.findElement(By.id("timerAlertButton"));//locate  Click ME button

		Actions actions = new Actions(driver);
		actions.scrollFromOrigin(ScrollOrigin.fromElement(clickMeButton), 0, 200).perform();//scroll to avoid adds of page(ElementClickInteruptedException)
		clickMeButton.click();
		explicitWait.until(ExpectedConditions.alertIsPresent());//to give explicit wait till alert is present
		Alert alert = driver.switchTo().alert();
		alert.accept();//click on OK button of Conformation alert pop-up
	}
}
