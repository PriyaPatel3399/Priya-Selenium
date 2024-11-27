package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_locatingBANK_ONLINE_linktext
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		
		driver.findElement(By.xpath("//a[contains(text(),'Book Online')]")).click(); //xpath by contains()
		
		/* 3) xpath by contains()---xpath("//tagname[cotains(text(),'partial_Text')]")----for partial linktext or visible text also----                                                                                                                                                                                                                    
	 	                                             xpath("//tagname[cotains(@attname,'partial_attvalue')]")----for partial attvalue----                  		 */
		
	}

}
