package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_checkRadioButtonSelectedOrNot
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		 WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));//locate Female radio button by xpath directly
		 WebElement radioButton1 = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));//locate Female radio button by xpath directly
         //check for female button
		 if(radioButton.isSelected())//check it is selected or not by using -----isSelected()
		 {
			 System.out.println("Female Radio button is selected");
		 }
		 else
		 {
			 System.out.println("Female Radio button is not selected");
			 radioButton.click();                     //if not selected, selected now by ----click()
			 System.out.println("Female Radio button is selected Now");
		 }
		 //check for Male button
		 if(radioButton1.isSelected())//check it is selected or not by using -----isSelected()
		 {
			 System.out.println("Male Radio button is selected");
		 }
		 else
		 {
			 System.out.println("Male Radio button is  not selected");

		 }
	}
}
