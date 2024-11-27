package org.searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_locatingLoginButton
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("piyupatel331999@gmail.com"); //locate an element nd pass data
		driver.findElement(By.id("Password")).sendKeys("12345678"); //locate an element nd pass data
		
		driver.findElement(By.className("login-button")).click(); //locate an element by using By.className(), nd click the button
		
		/*5)className(String cliassname)--By--use to locate an elemnt by classname
		  
		              *i) we have to take unique classname, it can be duplicate,that time avoid clssname and go eith other option
		              *ii)To check 1 of 1 use .classname in search html code, ex(.login_button)
		              *iii)In class tag we have so many nestedclass, to select any perticular class we have take lastname of class tag
		                   ex. class = "button-1 login-button", in this we have to use only "login-button"
		      
		 *6)tagName(String tagname)--By--use to locate by tagname, we are not usig it because tagname can't be unique, it has so many duplicates
		                                 like a,input,title,body etc.     
		 */
	}
}
