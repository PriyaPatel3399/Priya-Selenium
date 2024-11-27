package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LLinkText_locatingMotorcyclesLink
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/"); //here, we have dif cases in webpage & html code
		
		driver.findElement(By.linkText("MOTORCYCLES")).click(); //locating motorcycles link with By.linkText("MOTORCYCLES"),and click on it
		
		/*3)linkText(String linktext)--By--use to locate an element with link by linktext 
		 *                                 by passing linktext( text present between <a>___</a> )
		 * we have to take linktext, which don't have space at start & end of the linkText
		 * when we hve diff cases in webpage & html code,then give priority to webpage cases to locate an element
		 */
	}
}
