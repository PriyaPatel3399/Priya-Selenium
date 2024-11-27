package org.pop_Up_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_avoid_PopUp_inNauki
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount");
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		//to search file upload button, use //input[@type='file'], then pass path directly in sendkeys()
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\admin\\Documents\\Test Engineering Freshers' resume Template.docx");
	}
}
