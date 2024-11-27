package org.searchContextMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_LogicalAnd_locatingRadioButton 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Xpath%20Logical%20Operator.html");
		driver.findElement(By.xpath("//input[@name='gender' and @value='M']")).click();
		
		/*6) xpath by logical_And_Operator----xpath("//tagname[ Operand1 logicalOperator Operand2')]")
	 	                                                                we can use operand like @attname= 'attvalue',  text()='text',  starts-with(),  ends-with()
		                                                                xpath("//tagname[@attname='attvalue' and @attname='attvlue')]")---for and & or operatoe---
	 	                                                             * locating base on two attribute when, we have duplicate atributes , we not able to find any unique attribute */
	}
}
