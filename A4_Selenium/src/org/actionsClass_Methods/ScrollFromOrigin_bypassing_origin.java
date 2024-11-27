package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrigin_bypassing_origin 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		WebElement wakad = driver.findElement(By.xpath("//h5[text() = 'Wakad']"));
		
		Actions actions = new Actions(driver);
		actions.scrollFromOrigin(ScrollOrigin.fromElement(wakad), 0, 90).perform();//scroll till ele and scroll again little by giving offsets
	}
}
	
