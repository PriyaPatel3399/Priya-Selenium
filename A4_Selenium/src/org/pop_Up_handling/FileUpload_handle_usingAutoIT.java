package org.pop_Up_handling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_handle_usingAutoIT 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/");
		
		driver.findElement(By.xpath("//h3[contains(text(),'PDF to Word')]")).click();//locate link nd click
		driver.findElement(By.id("pickfiles")).click();//locate file button nd click to get pop-up
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\admin\\Documents\\FileUpload.exe");//upload file using autoIt script
	}
}
