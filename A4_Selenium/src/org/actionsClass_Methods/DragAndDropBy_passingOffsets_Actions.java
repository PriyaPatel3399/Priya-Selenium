package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy_passingOffsets_Actions
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
			Thread.sleep(3000);
			WebElement fromslider = driver.findElement(By.xpath("//span[@class ='irs-slider from']"));
			WebElement toslider = driver.findElement(By.xpath("//span[@class ='irs-slider to']"));

			Actions actions = new Actions(driver);
			actions.dragAndDropBy(fromslider, 30, 0).pause(2000).perform();//drag slider 30 x nd drop it
			
			actions.dragAndDropBy(toslider,-60, 0).pause(3000).dragAndDropBy(toslider, 30, 0).perform();//drag slider -60 & dropit,
																																										   //again use drag&drop to move it in oposite direction
	
	}

}
