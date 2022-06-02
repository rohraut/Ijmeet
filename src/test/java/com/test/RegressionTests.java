package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.config.BaseTest;
import com.ijmeet.pages.ContactSales;
import com.ijmeet.pages.HomePageTests;

import com.ijmeet.pages.SigninPage;
import com.one.UIKeywords;

public class RegressionTests extends BaseTest {
	// UIKeywords uk =new UIKeywords();
	// HomePageTests rm = new HomePageTests();

	@Test
	public void verifyTitleOfHomePage() {

		UIKeywords.launchBrowser("CHROMe");
		UIKeywords.launchURL("https://ijmeet.com/");
		String actualTitle = UIKeywords.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "IJmeet")


public class RegressionTests extends BaseTest {
	@Test(enabled = false)
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

	@Test(enabled = false)
	public void JoinMeetingLnk() {
		// HomePageTests rm =
		// PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		HomePageTests rm = PageFactory.initElements(UIKeywords.driver, HomePageTests.class);// for constructor use
		// home.SignIn.click();
		rm.clickOnJoinMeetingLnk();

	}

	@Test
	public void ContactSalesOfIjmeet() {

		HomePageTests rm = PageFactory.initElements(UIKeywords.driver, HomePageTests.class);
		rm.clickOnContactSales();
		
		ContactSales pg = new ContactSales();
		pg.enternNameFieldLnk();
		pg.enterEmailFieldLnk();
		pg.typeMessage();
		pg.handlingCaptcha();
		pg.clickOnSendButton();

	}

	@Test
	public void JoinMeetingOfIjmeet() {

		HomePageTests hp = PageFactory.initElements(UIKeywords.driver, HomePageTests.class);
		hp.clickOnJoinMeetingLnk();
		
		JoinMeetingPage jm = PageFactory.initElements(UIKeywords.driver, JoinMeetingPage.class);
		jm.nameFieldLnk();
		jm.enterMeetingId();
		jm.clickOnJoinMeeting();

	}

	@Test
	public void JoinMeetingLnk() {
		HomePageTests rm = PageFactory.initElements(UIKeywords.driver, HomePageTests.class);// for constructor use
		rm.clickOnJoinMeetingLnk();

	}

	@Test
	public void verifyHomeOfIjmeet() {

		HomePageTests rm = PageFactory.initElements(UIKeywords.driver, HomePageTests.class);

	}

	@Test
	public void Signin() {
		HomePageTests sn = new HomePageTests();
		sn.clickOnsignin();
		SigninPage sg = new SigninPage();
		sg.enteremail();
		sg.enterpassword();
		sg.singbutton();

	}
	public void SignInPageOfIjmeet() throws InterruptedException {
		HomePageTests hp = PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		hp.clickOnSignInLnk();
		
		SignInPage sp =PageFactory.initElements(UIKeywords.driver,SignInPage.class);
		sp.enterEmail();
		sp.enterPassword();
		Thread.sleep(2000);
		sp.clickOnViewPaaword();
		Thread.sleep(2000);
		sp.clickOnRemberMeLnk();
		Thread.sleep(2000);
		sp.clickOnSignIn();
		System.out.println("successfully clicked");

	}
	@Test
	public void signUpPageOfIjmeet() throws InterruptedException {
		HomePageTests hm= PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		hm.clickOnSignUp();
		SignUpPage sn = PageFactory.initElements(UIKeywords.driver,SignUpPage.class);
		sn.enterName();
		sn.enterCompanyName();
		sn.enterEmailId();
		sn.enterMobilLnk();
		sn.enterPasswordLnk();
		sn.showPasswordLnk();
		
		Thread.sleep(2000);
		sn.showPasswordLnk();
		sn.clickOnSignUp();

	}

	@Test(enabled = false)
	public void HostMeetingLnk() throws InterruptedException {
		HomePageTests rm = new HomePageTests();
		Thread.sleep(2000);
		rm.clickOnHostMeetingLnk();

	}

	@Test
	public void SignInLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnSignInLnk();

	}

	@Test
	public void SignUpLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnSignUp();
	}

	@Test
	public void ArabicLnk() throws InterruptedException {
		HomePageTests rm = new HomePageTests();
		Thread.sleep(2000);
		//rm.clickOnArabicLnk();
	}

	@Test
	public void logoOfIjmeet() throws InterruptedException {
		HomePageTests rm = new HomePageTests();
		Thread.sleep(2000);
		rm.clickOnLogoLnk();

	}

	@Test
	public void AndroidLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnAndroidLnk();

	}

	@Test
	public void AppleLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnAppleLnk();

	}

	@Test
	public void WindowLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnWindowsLnk();
	}

	@Test(priority = -1)
	public void nameField() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.enternNameFieldLnk();

	}

	@Test(priority = 0)
	public void enterEmailField() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.enterEmailFieldLnk();

	}

	@Test(priority = 1)
	public void messageField() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.typeMessage();

	}

	@Test(priority = 2)
	public void captchaLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.handlingCaptcha();

	}

	@Test(priority = 3)
	public void SendLnk() {
		HomePageTests rm = new HomePageTests();
		rm.clickOnContactSales();
		ContactSales cw = new ContactSales();
		cw.clickOnSendButton();

	}

}