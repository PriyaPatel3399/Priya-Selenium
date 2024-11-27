package org.actionsClass_Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_MouseHoverActions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 WebElement fashion = driver.findElement(By.xpath("//span[text() = 'Fashion']"));//locate fashion tab
		 
 		 Actions actions = new Actions(driver);
		 actions.moveToElement(fashion).perform();//mousehover on fashion tab    
	}
}
