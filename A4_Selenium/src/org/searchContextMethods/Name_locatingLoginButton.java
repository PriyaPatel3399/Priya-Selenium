package org.searchContextMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_locatingLoginButton
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("piyupatel331999@gmail.com"); //locate an element nd pass data
		driver.findElement(By.id("pass")).sendKeys("12345678"); //locate an element nd pass data
		
		driver.findElement(By.name("login")).click(); //locate an element by using By.name(), nd click the button
		
		
		/*2)name(String name)--By--use to locate an element with name
		 * 						   
		 * search or check name is one on one in html code or note, we use tagname[attribute_name='attribute_value']  ex. button[name='login']
		 * when we have radio button,where we have to select any one,at that time in html code they will give same name like Gender
		 */
	}
}
