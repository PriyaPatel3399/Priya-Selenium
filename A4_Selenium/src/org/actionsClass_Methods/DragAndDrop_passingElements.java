package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_passingElements
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			WebElement capital = driver.findElement(By.id("box1"));//locate capital oslo
			WebElement country = driver.findElement(By.id("box101"));//locate country norway
			
			Actions actions = new Actions(driver);
			actions.dragAndDrop(capital, country).perform();//drag nd drop from capital to country
			String colorOfCapital = capital.getCssValue("background-color");//get bg-color of capital
			System.out.println(colorOfCapital);//green-255

	}


}
