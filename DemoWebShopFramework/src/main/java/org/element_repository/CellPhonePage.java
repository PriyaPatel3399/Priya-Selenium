package org.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends BasePage
{
	public CellPhonePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(linkText = "Smartphone")
	private WebElement smartPhoneLink;
	
	@FindBy(linkText = "Used phone")
	private WebElement usedPhoneLink;
	
	@FindBy(linkText = "Phone Cover")
	private WebElement phoneCoverLink;
	
	
//==============getter methods===========
	public WebElement getSmartPhoneLink()
	{
		return smartPhoneLink;
	}
	
	public WebElement getUsedPhoneLink()
	{
		return usedPhoneLink;
	}
	
	public WebElement getPhoneCoverLink()
	{
		return phoneCoverLink;
	}
	
	

}
