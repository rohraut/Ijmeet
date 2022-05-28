package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	@FindBy(css="input[placeholder=\" Enter email address \"]")
	public WebElement EmailLnk;
	@FindBy(css="input[placeholder=\" Enter password \"]")
	public WebElement PasswordLnk;
	@FindBy(css="em#icon-change")
	public WebElement ViewPasswordLnk;
	@FindBy(css="input.form-check-input")
	public WebElement RememberMeLnk;
	@FindBy(css="button[type=\"submit\"]")
	public WebElement SignInLnk;

	
	public void enterEmail() {
		EmailLnk.sendKeys("rohanraut@gmail.com");

	}
	public void enterPassword() {
		PasswordLnk.sendKeys("rohraut123");

	}
	public void clickOnViewPaaword() {
		ViewPasswordLnk.click();

	}
	public void clickOnRemberMeLnk() {
		RememberMeLnk.click();

	}
	public void clickOnSignIn() {
		SignInLnk.click();

	}
}

