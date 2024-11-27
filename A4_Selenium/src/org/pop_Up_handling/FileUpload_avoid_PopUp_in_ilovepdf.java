package org.pop_Up_handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_avoid_PopUp_in_ilovepdf 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/");
		
		driver.findElement(By.xpath("//h3[contains(text(),'PDF to Word')]")).click();//locate link nd click
		//to search file upload button, use //input[@type='file'], then pass path directly in sendkeys()
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\admin\\Downloads\\DocScanner May 20, 2024 11-14 PM_240520_232018.pdf");
	}
}
