package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.one.UIKeywords;

public class ContactSales {
	public ContactSales() {
		PageFactory.initElements(UIKeywords.driver,this);
	}

	@FindBy(css = "input[placeholder=\"Enter your name \"]")
	public WebElement NameField;

	@FindBy(css = "input[placeholder=\" Enter your email \"]")
	public WebElement Email;

	@FindBy(css = "textarea[placeholder=\" Type message \"]")
	public WebElement Message;

	@FindBy(css = "div.recaptcha-checkbox-border")
	public WebElement Captcha;

	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-primary1 com-md-3 w-100 m-0\"]")
	public WebElement SendButton;

	public void enternNameFieldLnk() {
		NameField.sendKeys("Ankita Mahalle");
	}

	public void enterEmailFieldLnk() {
		Email.sendKeys("abc@gmail.com");
	}

	public void typeMessage() {
		Message.sendKeys("sdkjghlk");
	}

	public void handlingCaptcha() {
		Captcha.click();
	}
	
	public void clickOnSendButton() {
		SendButton.click();
	}

}
