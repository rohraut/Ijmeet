package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.config.BaseTest;
import com.ijmeet.pages.ContactSales;
import com.ijmeet.pages.HomePageTests;
import com.one.UIKeywords;

public class RegressionTests extends BaseTest {
	@Test(enabled=false)
	public void verifyTitleOfHomePage() {

		UIKeywords.launchBrowser("CHROMe");
		// UIKeywords.driver.get("https://ijmeet.com/");
		UIKeywords.launchURL("https://ijmeet.com/");
		// String actualTitle = UIKeywords.driver.getTitle();
		String actualTitle = UIKeywords.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "IJmeet");
		// UIKeywords.closeBrowser();

	}

	@Test(enabled=false)
	public void JoinMeetingLnk() {
		// HomePageTests rm =
		// PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		HomePageTests rm =PageFactory.initElements(UIKeywords.driver,HomePageTests.class);// for constructor use
		// home.SignIn.click();
		rm.clickOnJoinMeetingLnk();

	}

	@Test
	public void ContactSalesOfIjmeet() throws InterruptedException {

		// HomePageTests rm =
		// PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.enternNameFieldLnk();
		Thread.sleep(3000);
		cw.enterEmailFieldLnk();
		Thread.sleep(3000);
		cw.typeMessage();
		Thread.sleep(3000);
		//cw.handlingCaptcha();
		cw.clickOnSendButton();
		// uk.driver.findElement(By.xpath("//a[@href=\"https://ijmeet.com/contact?csrt=4787608894725738589\"])[1]")).click();

	}

	@Test(enabled=false)
	public void HostMeetingLnk() throws InterruptedException {
		HomePageTests rm = new HomePageTests();
		Thread.sleep(2000);
		rm.clickOnHostMeetingLnk();

	}

	@Test(enabled=false)
	public void SignInLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnSignInLnk();

	}

	@Test(enabled=false)
	public void ClickOnSignUpLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnSignUpLnk();
	}

	@Test(enabled=false)
	public void ArabicLnk() throws InterruptedException {
		HomePageTests rm = new HomePageTests();
		Thread.sleep(2000);
		rm.clickOnArabicLnk();
	}

	@Test(enabled=false)
	public void logoOfIjmeet() throws InterruptedException {
		HomePageTests rm = new HomePageTests();
		Thread.sleep(2000);
		rm.clickOnLogoLnk();

	}

	@Test(enabled=false)
	public void AndroidLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnAndroidLnk();

	}

	@Test(enabled=false)

	public void AppleLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnAppleLnk();

	}

	@Test(enabled=false)
	public void WindowLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnWindowsLnk();
	}

	@Test(enabled=false)
	public void SupportLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnSupportLnk();

	}

	@Test(enabled=false)
	public void instagramLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnInstaLnk();

	}

	@Test(enabled=false)
	public void contactUsLnk() {
		HomePageTests rm = new HomePageTests();
		rm.ClickOnContactUsLnk();

	}

	@Test(priority=-1)
	public void nameField() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.enternNameFieldLnk();

	}

	@Test(priority=0)
	public void enterEmailField() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.enterEmailFieldLnk();

	}

	@Test(priority=1)
	public void messageField() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.typeMessage();

	}

	@Test(priority=2)
	public void captchaLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.handlingCaptcha();

	}
	@Test(priority=3)
	public void SendLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.clickOnSendButton();
		
	}
}