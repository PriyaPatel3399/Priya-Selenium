package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset_MousehoverActions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 WebElement fashion = driver.findElement(By.xpath("//span[text() = 'Fashion']"));//locate fashion tab
		 Point fashionLoc = fashion.getLocation();
		 int x = fashionLoc.getX();
		 int y = fashionLoc.getY();
 		
		 Actions actions = new Actions(driver);
		 //actions.moveToElement(fashion).perform();//mousehover on fashion tab    
		 actions.moveByOffset(x+1,y+1).perform();//search mouse coordinates in crome, add to crome, copy it(343,171)     
		 actions.moveByOffset(361, 171).pause(2000).perform();//mouse hover to fashion
		 Thread.sleep(2000);
		 actions.moveByOffset(473-361, 176-171).perform();//mouse hover to Electronics, we have to minus previous offset to move cursor on the stating corner

	}
}
