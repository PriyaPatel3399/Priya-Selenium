package org.searchContextMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_starts_locatingImg_startingValue
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[starts-with(text(),'Mobiles')]")).click();//locate img with xpath by starts-with()
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[starts-with(@title,'POCO M6')]")).click();//locate img with xpath by starts-with()

		
		/*4) xpath by starts-with()---xpath("//tagname[starts-with(text(),'starting_Text')]")---for partial text or linktext---  
	 	                                              xpath("//tagname[starts-with(.,'starting_text')]")----for partial text or linktext---replace text() with .       
	 	                                               xpath("//tagname[starts-with(@attname,'starting_attvalue')]")----for partial attvalue---          		 */
	}
}
