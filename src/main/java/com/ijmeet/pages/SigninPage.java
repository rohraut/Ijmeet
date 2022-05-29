package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.one.UIKeywords;

public class SigninPage {
	public SigninPage() {
		PageFactory.initElements(UIKeywords.driver, this);
	}

	@FindBy(css="#email")
	public WebElement YourName;
    
	@FindBy(css="#password")
	public WebElement Passwords;
	
	@FindBy(css="button[type=submit]")
	public WebElement singinpage;
	
	public void enteremail() {
		YourName.sendKeys("nikbobade51@gmail.com");
	}
	public void enterpassword() {
		Passwords.sendKeys("Bobade123@");
	}
	public void singbutton() {
		singinpage.click();
	}
}

