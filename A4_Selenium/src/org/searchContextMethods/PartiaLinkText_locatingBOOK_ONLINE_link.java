package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartiaLinkText_locatingBOOK_ONLINE_link
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		
		driver.findElement(By.partialLinkText("BOOK ONLINE")).click(); //locating BOOK ONLINE link,and click on it
		
		/*3)partialLinkText(String partiallinktext)--By--use to locate an element with link by partiallinktext 
		 *                                 by passing partialLinktext( text present between <a>___</a> )
		 *i)when linkText have space, which we can't count properly, so take small part of linktext
		 *ii)when we have very lengthy link then go for partial
		 *iii)when we have link with ststic & dynamic part,then locate with partial static part
		 */
	}

}
