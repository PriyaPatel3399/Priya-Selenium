package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_checkElementDisplayedOrNot
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		//check custom_gender textbox displayed or not, which is not displayed now,when we click on custom radiobutton then it will display
		WebElement customGenderTextbox = driver.findElement(By.id("custom_gender"));
		if(customGenderTextbox.isDisplayed())
		{
			System.out.println("CustomGenderTextbox is Displayed");
		}
		else
		{
			System.out.println("CustomGenderTextbox is  not Displayed");

		}
		//check custom radiobutton is selected or not, if not then click and select it
		 WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));//locate Custom radio button by xpath dependant independant
		 if(!customRadioButton.isSelected())
		 {
						 customRadioButton.click();
		 }
		 System.out.println("After click on Custom RadioButton, Custom_gender box is displayed ? : "+ customGenderTextbox.isDisplayed());
		 customGenderTextbox.sendKeys("Other");//enter the data into box
	}
}
