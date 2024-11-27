package org.searchContextMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Dif_Ways 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//locate  id by cssSelector()
		driver.findElement(By.cssSelector("#email")).sendKeys("#piyupatel331999@gmail.com"); //locate id by cssSelector(#idvalue)
		driver.findElement(By.cssSelector("input#pass")).sendKeys("12345678"); //locate id by cssSelctor(tagname#idvalue)
		driver.findElement(By.name("login")).click(); //locate button by name
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/");
		//locate  class & any att with general syntax by cssSelector()
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[id = 'Email']")).sendKeys("#piyupatel331999@gmail.com"); //locate id by cssSelector( tag[id='value'] )
		driver.findElement(By.cssSelector("input#Password")).sendKeys("12345678"); //locate id by cssSelctor
		driver.findElement(By.cssSelector(".login-button")).click(); //locate classname by cssSelector(.calssname)(tagname.classname)(tag[class='value'])
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/");
		//locate  partial attribute value by cssSelctor()--[for start  attname^,  for contains  attnam*, for ends attname$ ]- -don't give space btw in the syntax
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();//locate Electronics link
		driver.findElement(By.cssSelector("img[title^='Show products in category Cell']")).click(); //locate an img with By.cssSelector(tag[att^=value]) starts wih
		driver.findElement(By.cssSelector("img[title*='for Smartphone']")).click(); //locate an img with By.cssSelector(tag[att*=value) contains for any part
		
	}
}
