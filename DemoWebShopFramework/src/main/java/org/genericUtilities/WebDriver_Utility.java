package org.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author priya
 * 
 * This class contain reusable components to the selenium WebDriver
 * 
 */
public class WebDriver_Utility implements FrameworkConstants
{
	//===============For alert Pop-up ==============
	
	/** This method is used to click ok OK button of alert pop-up
	 * @param driver [WebDriver]
	 * @return void
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/** This method is used to click on Cancel button of alert pop-up
	 * @param driver  [WebDriver]
	 * @return void
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/** This method is used to send data to tesxt box of prompt alert pop-up
	 * @param driver  [WebDriver]
	 * @param data pass to alert pop-up  [String]
	 * @return void
	 */
	public void sendDataToAlert(WebDriver driver, String data)
	{
		driver.switchTo().alert().sendKeys(data);
	}
	/** This method is used to get(fatch) the text present in alert pop-up
	 * @param driver  [WebDriver]
	 * @return the text of alert [String]
	 */
	public String fatchTextFromAlert(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	//===========For Switch to A Tab==============
	
	/** This method is used to switch to a tab base on its title
	 * @param driver [WebDriver]
	 * @param title [String]
	 * @return void
	 */
		public void switchToATabBasedOnTitle(WebDriver driver, String title)
		{
			Set<String> allWindowIds = driver.getWindowHandles();
			for(String windowId : allWindowIds)
			{
				driver.switchTo().window(windowId);
				if(driver.getTitle().equalsIgnoreCase(title))
				{
					break;
				}
			}
		}
		/** This method is used to switch to a tab base on its url
		 * @param driver [WebDriver]
		 * @param url [String]
		 * @return void
		 */
			public void switchToATabBasedOnUrl(WebDriver driver, String url)
			{
				Set<String> allWindowIds = driver.getWindowHandles();
				for(String windowId : allWindowIds)
				{
					driver.switchTo().window(windowId);
					if(driver.getTitle().equalsIgnoreCase(url))
					{
						break;
					}
				}
			}
			//=========For switch to a Frame========
			
			/** This method is used to switch to a frame by using index value
			 * @param driver  [WebDriver]
			 * @param index [int]
			 * @return void
			 */
			public void switchToAFrameUsingIndex(WebDriver driver, int index)
			{
				driver.switchTo().frame(index);
			}
			/** This method is used to switch to a frame by using element ref. of that frame
			 * @param driver [WebDriver]
			 * @param element [WebElement]
			 * @return void
			 */
			public void switchToAFrameUsingElement(WebDriver driver, WebElement element)
			{
				driver.switchTo().frame(element);
			}
			/** This method is used to switch to a frame by using name or id attribute of that frame
			 * @param driver  [WebDriver]
			 * @param name or id [String]
			 * @return void
			 */
			public void switchToAFrameUsingNameOrId(WebDriver driver, String nameOrId)
			{
				driver.switchTo().frame(nameOrId);
			}
			//========For Taking Screenshot=======
			
			/**  This method is used to capture the screenshot, nd tore it in a given folder(errorshot)
			 * @param driver  [WebDriver]
			 * @return void
			 */
			public void captureScreenshot(WebDriver driver) 
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File screenshot = ts.getScreenshotAs(OutputType.FILE);
				File realss = new File( ERRORSHOT_PATH +Java_Utility.timeStamp()+"screenshot.png");
				try 
				{
					FileHandler.copy(screenshot, realss);
				} 
				catch (IOException e)
				{
							e.printStackTrace();
				}
			}
			//===========For Select Class Methods(Dropdown)========	
			
			/** This method is used to select all the option one by one of perticular dropdown
			 * @param driver  [WebDriver]
			 * @param dropdownElement [WebElement]
			 * @return void
			 */
			public void selectAllOptions(WebDriver driver, WebElement dropdownElement)
			{
				Select s = new Select(dropdownElement);
				if (s.isMultiple())
				{
					List<WebElement> allOptions = s.getOptions();
					for(WebElement option : allOptions)
					{
								String text = option.getText();
								s.selectByVisibleText(text);
					}
				}
				else 
				{
					throw new NotAMultiselect_DropdownException("It is a Single select Dropdown, so can't select all options togather");
				}
			}
			
}
