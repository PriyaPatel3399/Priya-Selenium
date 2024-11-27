package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_LogicalOr_locatingFirstnameTextBox
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/xpath%20by%20logical%20or%20operator.html");
		WebElement textbox = driver.findElement(By.xpath("//input[@id='l-name' or @value='F']"));
		textbox.clear();//use to clear textbox value
		textbox.sendKeys("priya");
		
		/*6) xpath by logical_Or_Operator----xpath("//tagname[ Operand1 logicalOperator Operand2')]")
	 	                                                                we can use operand like @attname= 'attvalue',  text()='text',  starts-with(),  ends-with()
		                                                                xpath("//tagname[@attname='attvalue' or @attname='attvlue')]")---for and & or operatoe---
	 	                                                             * locating base on two attribute when, we have duplicate atributes , we not able to find any unique attribute */
	}

}
