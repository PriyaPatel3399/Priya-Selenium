package org.syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWait_useInReliance
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//use syncriniztion
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.id("wzrk-cancel")).click();//locate pop up, nd click on it
		WebElement homeAppliances = driver.findElement(By.xpath("//div[text() = 'Home Appliances']"));//locate homeAppliances tab
		
		Actions actions = new Actions(driver);//pass webdriver ref. in construstor
		actions.moveToElement(homeAppliances).perform();//mousehover on homeAppliances tab

	}


}
