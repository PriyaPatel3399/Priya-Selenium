package org.element_repository;

import org.genericUtilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseClass
{
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;

	@FindBy(id = "small-searchterms")
	private WebElement searchBoxTextBox;

	@FindBy(xpath = "//input[@value='Search store']")
	private WebElement searchButton;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookaLink;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;

	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement appleshoesLink;

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;

	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchBoxTextBox() {
		return searchBoxTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBookaLink() {
		return bookaLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getAppleshoesLink() {
		return appleshoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}
}
