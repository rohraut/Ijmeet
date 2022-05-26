package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.one.UIKeywords;

public class HomePageTests {
	
	public HomePageTests() {
		
		PageFactory.initElements(UIKeywords.driver, this);
	}
	
	
	@FindBy(css="ul.ml-auto :nth-child(1) a.font-weight-bold")
	 public  WebElement JoinMeetingLnk;
	
	@FindBy(css="a[href=\"https://ijmeet.com/host_meeting?csrt=4787608894725738589\"]")
	public WebElement HostMeetingLnk;
	
	@FindBy(css="ul.ml-auto :nth-child(3) a.font-weight-bold")
	public WebElement ContactSalesLnk;
	
	@FindBy(css="a[href=\"https://ijmeet.com/login?csrt=4787608894725738589\"]")
	public WebElement SignInLnk;
	
	@FindBy(css="a[href=\"https://ijmeet.com/login?csrt=4787608894725738589\"]")
	public WebElement SignUpLnk;
	
	
	public void clickOnJoinMeetingLnk() {
		JoinMeetingLnk.click();

	}
	public void clickOnHostMeetingLnk() {
		HostMeetingLnk.click();
		
	}
	
	public void clickOnContactSales() {
		ContactSalesLnk.click();

	}
}


