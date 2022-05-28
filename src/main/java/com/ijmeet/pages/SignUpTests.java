package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.one.UIKeywords;

public class SignUpTests {
	
	public SignUpTests() {
		PageFactory.initElements(UIKeywords.driver, this);
		//In case of constructor use this keyword in initElememnts() otherwise classname.class
	}
	
	//div.input-group input#name 
	@FindBy(css = "div.justify-content-center  input#name")
	public WebElement fullName;
	
	@FindBy(css = "div.input-group input#company_name")
	public WebElement companyName;
	
	@FindBy(css = "div.input-group input#email")
	public WebElement emailId;
	
	@FindBy(css = "div.input-group input#contact")
	public WebElement mobileNo;
	
	@FindBy(css = "div.input-group input#password")
	public WebElement password;
	
	@FindBy(css = "div.input-group em#icon-change")
	public WebElement viewPassword;
	
	@FindBy(css = "div.rc-anchor-logo-text")
	public WebElement captcha;
	
	@FindBy(css = "div.align-items-center span.sign-up-accounthave")
	public WebElement logIn;
	
	@FindBy(css = "div.my-0 button.mirror-view-btn-primary")
	public WebElement signUp;
	
	@FindBy(css = "div.common-view-sign-in a.social-login-button-google")
	public WebElement signInWithGoogle;
	
	@FindBy(css = "div.common-view-sign-in a.social-login-button-facebook")
	public WebElement signInWithFacebook;
	
	@FindBy(css = "div.common-view-sign-in a.social-login-button-sso")
	public WebElement signInWithFederation;
	
	public void enterFullName() {
		fullName.sendKeys("Sneha Dhanorkar");

	}
	
	public void enterEmailId() {
		emailId.sendKeys("snehadhanorkar@gmail.com");

	}
	
	public void enterCompanyName() {
		companyName.sendKeys("Resonantia pvt. ltd.");

	}
	public void enterMobileNo() {
		mobileNo.sendKeys("9860888888");

	}
	public void enterPassword() {
		password.sendKeys("Dhanorkar12121#");

	}
	
	public void clickOnViewPassword() {
		viewPassword.click();;

	}
	
	
	public void checkCaptcha() {
		captcha.click();

	}
	
	public void clickOnLogIn() {
		logIn.click();

	}
	public void clickOnSignUp() {
		signUp.click();

	}
	public void clickOnSignInWithGoogle() {
		signInWithGoogle.click();

	}
	public void clickOnSignInWithFaceBook() {
		signInWithFacebook.click();

	}
	public void clickOnSignInWithFederation() {
		signInWithFederation.click();

	}
	

}
