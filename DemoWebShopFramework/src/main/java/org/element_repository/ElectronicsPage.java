package org.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage
{
	public ElectronicsPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraLink;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhoneLink;
	
	//====getter methods=====
	public WebElement getCameraLink() {
		return cameraLink;
	}
	public WebElement getCellPhonesLink() {
		return cellPhoneLink;
	}
}
