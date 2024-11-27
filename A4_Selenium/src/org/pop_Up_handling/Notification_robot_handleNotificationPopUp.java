package org.pop_Up_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification_robot_handleNotificationPopUp
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.easemytrip.com/");
		Thread.sleep(2000);
		
		Robot robot = new Robot();//use rorbot class method to handle Notification po-up, which has Allow or Deny  button
		robot.keyPress(KeyEvent.VK_TAB);//press tab key to move at close button
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);//again press tab key to move at Allow button
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);//again press tab key to move at Deny button
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);//press enter to click on Deny button
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
