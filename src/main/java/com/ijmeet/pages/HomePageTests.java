package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.one.UIKeywords;

public class HomePageTests {

	@FindBy(css = "ul.ml-auto :nth-child(1) a.font-weight-bold")
	public WebElement JoinMeetingLnk;

	@FindBy(css = "a[href=\"https://ijmeet.com/host_meeting?csrt=4787608894725738589\"]")
	public WebElement HostMeetingLnk;

	@FindBy(css = "ul.ml-auto :nth-child(3) a.font-weight-bold")
	public WebElement ContactSalesLnk;

	@FindBy(css = "a.nav-right-cutom-bg")
	public WebElement SignInLnk;

	@FindBy(css = "ul.ml-auto :nth-child(5) a.font-weight-bold")
	public WebElement SignUpLnk;
	@FindBy(css = "img[src=\"https://ijmeet.com/images/profile_img/flag-view.png\"]")
	public WebElement ArabicLnk;
	@FindBy(css = "img[src=\"https://ijmeet.com/images/profile_img/windows.png\"]")
	public WebElement WindowsLnk;
	@FindBy(css = "img[src=\"https://ijmeet.com/images/profile_img/ios.png\"]")
	public WebElement AppleLnk;
	@FindBy(css = "img[src=\"https://ijmeet.com/images/profile_img/android.png\"]")
	public WebElement AndroidLnk;
	@FindBy(css = "img[src=\"https://ijmeet.com/images/LOGO-F@2x.png\"]")
	public WebElement logoLnk;

	public void clickOnJoinMeetingLnk() {
		JoinMeetingLnk.click();

	}

	public void clickOnHostMeetingLnk() {
		HostMeetingLnk.click();

	}

	public void clickOnContactSales() {
		ContactSalesLnk.click();

	}

	public void clickOnSignInLnk() {
		SignInLnk.click();

	}

	public void clickOnArabicLnk() {
		ArabicLnk.click();

	}

	public void clickOnLogoLnk() {
		logoLnk.click();

	}

	public void clickOnAndroidLnk() {
		AndroidLnk.click();

	}

	public void clickOnAppleLnk() {
		AppleLnk.click();

	}

	public void clickOnWindowsLnk() {
		WindowsLnk.click();

	}

	public void clickOnSignUp() {
		SignUpLnk.click();

	}
}
