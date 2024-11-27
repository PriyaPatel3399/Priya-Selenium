package org.JavascriptExecutor_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executescript_scollIntoView_byusing_javascript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement orders = driver.findElement(By.linkText("Orders"));//locate orders link

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",orders);//give element index 0 in argument, nd give eleRef as another data
		//arguments[85].scrollIntoView(boolean) nd enter---give element index in argument, nd give true/false to scroll till that element---locate using javascript
	}
}
