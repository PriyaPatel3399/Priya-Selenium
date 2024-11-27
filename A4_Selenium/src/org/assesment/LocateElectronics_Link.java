package org.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElectronics_Link
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click(); //locate an element by using By.LINKtEXT(), nd click the link of capital cases
		
		
	}
}
