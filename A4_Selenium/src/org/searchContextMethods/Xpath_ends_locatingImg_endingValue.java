package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ends_locatingImg_endingValue 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();//locate Electronics link
		driver.findElement(By.xpath("//img[ends-with(@title,'Cell phones')]")).click(); //locate an img by ends-with()---for partial attvalue
		
		/*	 5) xpath by ends-with()---xpath("//tagname[ends-with(text(),'ending_Text')]")---for partial text or linktext---  
	 	                                              xpath("//tagname[ends-with(.,'ending_text')]")----for partial text or linktext---replace text() with .       
	 	                                               xpath("//tagname[ends-with(@attname,'endting_attvalue')]")----for partial attvalue---       
	 	 ** if ends-wih() is not working then, use contains() for loacate by any partial value or text        */
	}
}
