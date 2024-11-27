package org.selectClassMethodsForDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_3methods_locatingDate_selectBOD 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		
		//select date
	   WebElement dayDD = driver.findElement(By.id("day"));
	   Select selectDay = new Select(dayDD);
	   selectDay.selectByIndex(2);//select by index
	   //select month 
	   WebElement monthDD = driver.findElement(By.id("month"));
	   Select selectMonth = new Select(monthDD);
	   selectMonth.selectByValue("3");//select by value
	   //select year
	   WebElement yearDD = driver.findElement(By.id("year"));
	   Select selectYear = new Select(yearDD);
	   selectYear.selectByVisibleText("1999");//select by visibletext
	   Thread.sleep(2000);
	   
	   //check dropdown is single select or multiselect with the help of----isMultiple()
	   if(selectDay.isMultiple())
	   {
		  System.out.println("Dropdown is multi select"); 
	   }
	   else
	   {
			  System.out.println("Dropdown is single select"); 

	   }
	   //select  all day one by one(by value) with help of---getOptions()
	  List<WebElement> dayOptions = selectDay.getOptions();
	   for(WebElement x : dayOptions)
	   {
		   String dayvalue = x.getAttribute("value");
		   selectDay.selectByValue(dayvalue);
		   System.out.println(dayvalue);
		   Thread.sleep(150);
	   }
	 //select  all month one by one(by visible text) with help of---getOptions()
		  List<WebElement> monthOptions = selectMonth.getOptions();
		   for(WebElement x : monthOptions)
		   {
			   String monthtext = x.getText();
			   selectMonth.selectByVisibleText(monthtext);
			   System.out.println(monthtext);
			   Thread.sleep(250);
		   }
		 //select  all year one by one(by index) with help of---getOptions()
			  List<WebElement> yearOptions = selectYear.getOptions();
			  int yearindex = 0;
			   for(WebElement x : yearOptions)
			   {
				   selectYear.selectByIndex(yearindex);//pass index start from 0 nd increse it by 1++
				   yearindex++;
				   System.out.println(x.getText());
			   }
	}

}
