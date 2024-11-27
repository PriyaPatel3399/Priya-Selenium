package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_locatingImg_partialTagvalue
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();//locate Electronics link
		driver.findElement(By.xpath("//img[contains(@title,'category Cell phones')]")).click(); //locate an img by contains()---for partial attvalue
		
/* 3) xpath by contains()---xpath("//tagname[cotains(@attname,'partial_attvalue')]")----for partial attvalue----             	 */
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:www.flipkart.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[contains(@title,'Motorola Edge 50')]")).click();
		
	}
}
