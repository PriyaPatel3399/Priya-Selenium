package org.selectClassMethodsForDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_4methods_forMultiselectDD 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));//locate dropdown
		Select multiSelectDD = new Select(multiSelectionBox);
		
		//get options--select all options of dropdown by using---getOptions()--select one by one with for each loop
		List<WebElement> allOptions = multiSelectDD.getOptions();
		for(WebElement x : allOptions)
		{
			String text = x.getText();
			multiSelectDD.selectByVisibleText(text);
			System.out.println(text);
		}
		//deseletion 4 methods
		Thread.sleep(2000);
		multiSelectDD.deselectByIndex(0);//deselect by index
		Thread.sleep(2000);
		multiSelectDD.deselectByValue("swiftx");//deselect by value
		Thread.sleep(2000);
		multiSelectDD.deselectByVisibleText("Audi");//deselect by text
		Thread.sleep(2000);
		multiSelectDD.deselectAll();//deselect all options
		Thread.sleep(2000);
		//selection methods
		multiSelectDD.selectByValue("swiftx");//select by value
		multiSelectDD.selectByVisibleText("Audi");//select by text
		//get AllSelectedOptions
		System.out.println("All the selected options:");
		List<WebElement> selectedOptions = multiSelectDD.getAllSelectedOptions();//get all selected options usig----getAllSelectedOptions()
		for(WebElement x : selectedOptions)
		{
			String selectedOptionstext = x.getText();
			System.out.println(selectedOptionstext);
		}
		//get un-selected options
		System.out.println("=====UnSelected car Options=====");
	   allOptions.removeAll(selectedOptions);//to get unselected options---alloptions - (removeAll.)selectedoptions
	   for(WebElement x : allOptions)
		{
			String cartextUnseletcted = x.getText();
			System.out.println(cartextUnseletcted);
		}
	   //get first selected option
		String firstOption = multiSelectDD.getFirstSelectedOption().getText();//get first selected option now
		System.out.println("First Option Selected now: "+firstOption);
	}
}
