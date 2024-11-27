package org.pop_Up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class To_handle_PromptAlert_inDemoQA
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://demoqa.com/alerts");
		
		 WebElement clickMeButton = driver.findElement(By.id("promtButton"));//locate  Click ME button

		Actions actions = new Actions(driver);
		actions.scrollFromOrigin(ScrollOrigin.fromElement(clickMeButton), 0, 200).perform();//scroll to avoid adds of page(ElementClickInteruptedException)
		clickMeButton.click();//click to get Prompt alert
		
		Alert alert = driver.switchTo().alert();//click on Cancel button to handle Conformation alert
		alert.sendKeys("Priya");
		alert.accept();
	}

}
