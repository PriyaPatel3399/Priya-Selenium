package org.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
	public RegisterPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id = "gender-male")
	private WebElement genderMaleRadioButton1;

	@FindBy(id = "gender-female")
	private WebElement genderFeMaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;

	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;

	@FindBy(id = "Email")
	private WebElement emailtextBox;

	@FindBy(id = "Password")
	private WebElement passwordtextBox;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordtextBox;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getGenderMaleRadioButton() {
		return genderMaleRadioButton1;
	}

	public WebElement getGenderFeMaleRadioButton() {
		return genderFeMaleRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailtextBox() {
		return emailtextBox;
	}

	public WebElement getPasswordtextBox() {
		return passwordtextBox;
	}

	public WebElement getConfirmPasswordtextBox() {
		return confirmPasswordtextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void register(String firstName, String lastName, String email, String password, String confirmPassword) {

		firstNameTextBox.sendKeys(firstName);
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lastName);
		emailtextBox.clear();
		emailtextBox.sendKeys(email);
		passwordtextBox.clear();
		passwordtextBox.sendKeys(password);
		registerButton.click();
		confirmPasswordtextBox.clear();
		confirmPasswordtextBox.sendKeys(confirmPassword);

	}
}
