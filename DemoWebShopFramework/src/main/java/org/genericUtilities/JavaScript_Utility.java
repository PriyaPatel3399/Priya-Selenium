package org.genericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript_Utility implements FrameworkConstants
{
	public JavascriptExecutor jse;
	public JavaScript_Utility(WebDriver driver)
	{
		 jse = (JavascriptExecutor)driver;
	}
	/**
	 *  This method is used to click on passed element by using javascript
	 * @param element [WebElement]
	 * @return void
	 */
	public void jsClick(WebElement element)
	{
		jse.executeScript("argument[0].click()", element);
	}
	/**
	 * This method is used to passed the data to textbox in passed element by using javascript
	 * @param element [WebElement]
	 * @param data [String]
	 * @return void
	 */
	public void jsSendKeys(WebElement element, String data)
	{
		jse.executeScript("argument[0].value='"+data+"'", element);
	}
	/**
	 * This method is used to scroll page by giving x nd y offsets  by using javascript
	 * @param xOffset [int]
	 * @param yOffset [int]
	 * @return void
	 */
	public void jsScrollBy(int xOffset, int yOffset )
	{
		jse.executeScript("argument[0].scrollBy("+xOffset+","+yOffset+")");
	}
	/**
	 * This method is used to scroll page by giving x nd y coordinates  by using javascript
	 * @param coordinates [int]
	 * @param coordinates [int]
	 * @return void
	 */
	public void jsScrollTo(int xCoordinate, int yCoordinate )
	{
		jse.executeScript("argument[0].scrollBy("+xCoordinate+","+yCoordinate+")");
	}
	/**
	 * This method is used to scroll on passed element by using javascript
	 * @param topview [boolean]
	 * @param element [WebElement]
	 */
	public void jsScrollIntoView( boolean topview,WebElement element)
	{
		jse.executeScript("argument[0].scrollIntoView("+topview+")",element);
	}
}
