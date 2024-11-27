package org.selectClassMethodsForDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Operational_Methods_use
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement carOptions = driver.findElement(By.id("cars"));//locate car dropdown by id
		Select selectcars = new Select(carOptions);
		//select some options
		selectcars.selectByIndex(1);
		Thread.sleep(1000);
		selectcars.selectByVisibleText("Free ( 90 )");
		Thread.sleep(1000);
		selectcars.selectByValue("299");
		Thread.sleep(1000);
		
		List<WebElement> allCarOptions = selectcars.getOptions();//get all option---getOptions()
		List<WebElement> selectedCarOptions = selectcars.getAllSelectedOptions();//get selected options----getAllSelectedOptions()
		//get selected options
		System.out.println("=====Selected car Options=====");
		for(WebElement x : selectedCarOptions)
		{
			String cartext = x.getText();
			System.out.println(cartext);
		}
		//get un-selected options
		System.out.println("=====UnSelected car Options=====");
	   allCarOptions.removeAll(selectedCarOptions);//to get unselected options---alloptions - (removeAll.)selectedoptions
	   for(WebElement x : allCarOptions)
		{
			String cartexnotselected = x.getText();
			System.out.println(cartexnotselected);
		}
	   //get first selected option
	   String firstOption = selectcars.getFirstSelectedOption().getText();//get first selected option now
		System.out.println("First Option Selected now is: "+firstOption);
	}
}
