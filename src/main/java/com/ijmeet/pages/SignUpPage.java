package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	@FindBy(css="input#name")
	public WebElement FullNameLnk;
	
	@FindBy(css="input#company_name")
	public WebElement CompanyNameLnk;
	
	@FindBy(css="input#email")
	public WebElement EmailIdLnk;
	
	@FindBy(css="input#contact")
	public WebElement MobilNoLnk;
	
	@FindBy(css="input#password")
	public WebElement passwordLnk;
	
	@FindBy(css="a[onclick=\"showPassword(this)\"]")
	public WebElement ShowPasswordLnk;
	
	@FindBy(css="button[callback=\"after_create_action\"]")
	public WebElement SignUpLnk;
	
	
	
	public void enterName() {
		FullNameLnk.sendKeys("Rohan Dilip Raut");
		
		}
	public void enterCompanyName() {
		CompanyNameLnk.sendKeys("Resonantia");

	}
	public void enterEmailId() {
		EmailIdLnk.sendKeys("rohanrut372@gmail.com");

	}
	public void enterMobilLnk() {
		MobilNoLnk.sendKeys("7741969606");

	}
	public void enterPasswordLnk() {
		passwordLnk.sendKeys("rohan@123");

	}
	public void showPasswordLnk() {
		ShowPasswordLnk.click();

	}
	public void clickOnSignUp() {
		SignUpLnk.click();
		
	}
	
	

}
