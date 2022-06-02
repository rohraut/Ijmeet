package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeetingPage {
	
	@FindBy(css="input[placeholder=\"Enter your name\"]")
	public WebElement NameFieldLnk;
	
	@FindBy(css="input#meetingid")
	public WebElement idFieldLnk;
	
	@FindBy(css="button#before_start")
	public WebElement joinMeetingLnk;
	
	
	
	public void nameFieldLnk() {
		NameFieldLnk.sendKeys("rohanraut");

	}
	public void enterMeetingId() {
		idFieldLnk.sendKeys("1234");
	}
	public void clickOnJoinMeeting() {
		joinMeetingLnk.click();
	}

}
