package org.genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

/**
 * This class is used to perform some keyboaard nd mouse actions
 * @author priya
 */
public class Action_Utility implements FrameworkConstants
{
	Actions actions;
	/**
	 * This constructor is used to create obj of this class
	 * @param driver [WebDeiver]
	 */
	public Action_Utility(WebDriver driver)
	{
		this.actions = new Actions(driver);
	}
	/**
	 * This method is used to perform click action on given element
	 * @param element [WebElement]
	 * @return void
	 */
	public void clickOnElement(WebElement element)
	{
	actions.click(element).perform();	
	}
	/**
	 * This method is used to pass data to given element
	 * @param element [WebElement]
	 * @param data [String]
	 * @return void
	 */
	public void passDataToElement(WebElement element,String data)
	{
		actions.sendKeys(element,data).perform();
	}
	/**
	 * This method is used to perform doubleclick action on given element
	 * @param element [WebElement]
	 * @return void
	 */
	public void doubleClickOnElement(WebElement element)
	{
	actions.doubleClick(element).perform();	
	}
	/**
	 * This method is used to perform right click action on given element
	 * @param element [WebElement]
	 * @return void
	 */
	public void RightClickOnElement(WebElement element)
	{
	actions.contextClick(element).perform();	
	}
	/**
	 * This method is used to perform mouseHover action on given element
	 * @param element [WebElement]
	 * @return void
	 */
	public void mouseHoverOnElement(WebElement element)
	{
	actions.moveToElement(element).perform();	
	}
	/**
	 * This method is used to perform drag and drop action based on given element, here we have to pass source and dest element
	 * @param sourceElement  [WebElement]
	 * @param destElement  [WebElement]
	 * @return void
	 */
	public void dragAndDropAnElement(WebElement sourceElement,WebElement destElement)
	{
	actions.dragAndDrop(sourceElement,destElement).perform();	
	}
	/**
	 * This method is used to perform drag and drop action based on given element, x and y offsets value
	 * @param element  [WebElement]
	 * @param xOffset [int]
	 * @param yOffset [int]
	 * @return void
	 */
	public void dragAndDropBasedOnOffsets(WebElement element, int xOffset, int yOffset)
	{
		actions.dragAndDropBy(element, xOffset, yOffset).perform();;
	}
	/**
	 * This method is used to perfom scoll action based on given x and y offsets value
	 * @param xOffset [int]
	 * @param yOffset [int]
	 * @return void
	 */
	public void scrollBasedOnAmount(int xOffset, int yOffset)
	{
		actions.scrollByAmount(xOffset, yOffset).perform();;
	}
	/**
	 * This method is used to perform scoll action(until given element is visible in view port area) based on given dest element
	 * @param destElement  [WebElement]
	 * @return void
	 */
	public void scrollToElement(WebElement destElement)
	{
		actions.scrollToElement(destElement).perform();;
	}
	/**
	 * This method is used to perform scoll action(until given element is visible in view port area)and scroll extra as per x nd y offsets
	 * @param element  [WebElement]
	 * @param xOffset [int]
	 * @param yOffset [int]
	 * @return void
	 */
	public void scrollFromOrigin(WebElement element, int xOffset, int yOffset)
	{
		actions.scrollFromOrigin(ScrollOrigin.fromElement(element), xOffset, yOffset).perform();;
	}
	/**
	 * This method is used to perform paus action for the webpage
	 * @param seconds [int]
	 * @return void
	 */
	public void pauseAction(int seconds)
	{
		actions.pause(Duration.ofSeconds(seconds)).perform();
	}
	
}
