package org.assesment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDD_OmayoWebsite
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));//locate dropdown
		Select multiSelectDD = new Select(multiSelectionBox);
		List<WebElement> options = multiSelectDD.getOptions();
		//select all options of dropdown
		for(WebElement x : options)
		{
			String text = x.getText();
			multiSelectDD.selectByVisibleText(text);
			System.out.println(text);
		}
		//deseletion methods
		Thread.sleep(2000);
		multiSelectDD.deselectByIndex(0);//deselect by index
		Thread.sleep(2000);
		multiSelectDD.deselectByValue("swiftx");//deselect by value
		Thread.sleep(2000);
		multiSelectDD.deselectByVisibleText("Audi");//deselect by text
		Thread.sleep(2000);
		multiSelectDD.deselectAll();//deselect all options
		
	}
}
