package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.config.BaseTest;
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
		Assert.assertEquals(actualTitle, "IJmeet");

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

}
