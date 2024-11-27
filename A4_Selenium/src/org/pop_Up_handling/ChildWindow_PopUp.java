package org.pop_Up_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChildWindow_PopUp 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentId = driver.getWindowHandle();//store parent windowId
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();//locate continueToLogin button, on click on it
		driver.findElement(By.partialLinkText("Forgot Username")).click();//locate forgot username link, on click on it
		
		Set<String> allWindowIds = driver.getWindowHandles();//store all windowIds
		allWindowIds.remove(parentId);//remove parentId from allIds
		//switch control to another window,for that traverse set with for-each-loop to get  windowId
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);//switch control to new opened window(child-window pop-up)
		}
		driver.findElement(By.id("nextstep")).click();//click on next button of child window
		//enter details in child window pop-up
		driver.findElement(By.id("userName")).sendKeys("Priya");//locate username 
		driver.findElement(By.id("accountNo")).sendKeys("78546789543");//locate accountNo
		WebElement countryDD = driver.findElement(By.id("selCountry"));//locate country Dropdown
		Select selectCountry = new Select(countryDD);
		selectCountry.selectByVisibleText("India");//select option by visible text
		driver.findElement(By.id("mobileNo")).sendKeys("9876543214");//locate mobile number
		driver.findElement(By.name("dob")).sendKeys("03/03/1999");//locate dob
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("pu312");//locate captcha
		driver.findElement(By.name("Submit")).click();//locate submit button
	}
}
