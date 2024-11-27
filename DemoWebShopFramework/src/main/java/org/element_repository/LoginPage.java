package org.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement registerButton;

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void login(String email,String password)
	{
		getLoginLink().click();
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}
	public void logout()
	{
		getLogoutLink().click();
	}
}
