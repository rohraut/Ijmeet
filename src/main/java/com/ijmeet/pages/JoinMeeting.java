package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.one.UIKeywords;

public class JoinMeeting {
	public JoinMeeting(){
		PageFactory.initElements(UIKeywords.driver, this);
	}
	@FindBy(css="input#username")
	public WebElement yourNameLnk;
	
	@FindBy(css="input#meetingid")
	public WebElement meetingId;
	
	@FindBy(css="button#before_start")
	public WebElement joinMeetingBtn;
	
	public void enterYourName() {
		yourNameLnk.sendKeys("Nikhil");
	}

	public void entermeetingId() {
		meetingId.sendKeys("Shaarav");
	}
	
	public void clickJoinMeeting() {
		joinMeetingBtn.click();
	}
}
