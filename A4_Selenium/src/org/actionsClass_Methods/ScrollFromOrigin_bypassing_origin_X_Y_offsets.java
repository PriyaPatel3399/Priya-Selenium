package org.actionsClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrigin_bypassing_origin_X_Y_offsets
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement resumelink = driver.findElement(By.xpath("//span[text() = 'Resume writing']"));
		
		Actions actions = new Actions(driver);
	//	actions.scrollToElement(resumelink).scrollByAmount(0,100).perform();//scroll till element, but it show little element, pop up is there to intarect,so we can't click it
																															   //that' why we go with next method scrollFromOrigin()
																												    		  //we can use combintion of scrollToElement(ele).scrollByAmount(0,100).perform()
		ScrollOrigin srollorigin =ScrollOrigin.fromElement(resumelink);//this is factory method,which returns obj.
		actions.scrollFromOrigin(srollorigin, 0, 99).perform();//scroll till given element and again scroll to given offsets
	}
}
