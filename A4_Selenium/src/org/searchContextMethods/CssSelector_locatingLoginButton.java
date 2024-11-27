package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_locatingLoginButton
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();//locate login link
		driver.findElement(By.cssSelector("input[ value = 'Log in']")).click(); //locate an element with By.cssSelector()
		
		/*7)cssSelector(String cssSelector)--By--use to locate an element by cssSelector,which is like value
		                                         html code ex. <input class="button-1 login-button"  type="submit"  value="Log in">
		                                   
		               *To pass cssSelector we have to give expression by follow syntx: tagName[attributeName ='attributeValue'] 
		                ex. input[value='Log in']
		 ##when_to_go_for_cssSelector##              
		   1)when we don't have priority atributes(direct locators)
		   2)when we have duplicate direct locators
		   3)when we have other (unique)promising attribute like value, then we can take it as cssSelector             
		 */
	}
}
