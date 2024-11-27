package org.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_enter_MobileNo_inDream11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		//driver.findElement(By.id("regEmail")).sendKeys("9876543213");---we can't locate it directly,bcz it design by iframe, so 1st switch to iframe then try

	//	driver.switchTo().frame(0);//switch to frame by using index
	//	driver.switchTo().frame("send-sms-iframe");//switch to frame by using frame id or name
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);//switch to frame by using its locator as webElement
		
		driver.findElement(By.id("regEmail")).sendKeys("9876543213");//to enter data in frame located
		
		driver.switchTo().defaultContent();//switch out control from iframe, back to default page
		driver.findElement(By.id("hamburger")).click();
	}

}
