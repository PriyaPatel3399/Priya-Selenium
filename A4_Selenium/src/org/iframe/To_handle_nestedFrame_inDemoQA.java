package org.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_handle_nestedFrame_inDemoQA
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes/");
		
		WebElement parentframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parentframe);//switch to parent frame
		
		String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text1);
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);//switch to child frame
		
		String text2 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text2);
		
		driver.switchTo().parentFrame();//get control back to parent frame
		System.out.println(driver.findElement(By.tagName("body")).getText());
	
		driver.switchTo().defaultContent();//get control back to main page
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
	}
}
