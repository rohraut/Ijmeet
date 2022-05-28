package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.config.BaseTest;
import com.ijmeet.pages.HomePageTests;
import com.ijmeet.pages.SignUpTests;
import com.one.UIKeywords;

public class RegressionTests extends BaseTest {
	//HomePageTests rm = new HomePageTests();
	
	
	@Test
	public  void verifyTitleOfHomePage() {
		
		UIKeywords.launchBrowser("CHROMe");
		//UIKeywords.driver.get("https://ijmeet.com/");
		UIKeywords.launchURL("https://ijmeet.com/");
		//String actualTitle = UIKeywords.driver.getTitle();
		   String actualTitle;
		try {
			actualTitle = UIKeywords.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "IJmeet");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//UIKeywords.closeBrowser();
		
	}
	@Test
	public  void JoinMeetingLnk() {
		//HomePageTests rm = PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		HomePageTests rm = new HomePageTests();// for constructor use
		//home.SignIn.click();
		rm.clickOnJoinMeetingLnk();
		

	}
	@Test
	public  void verifyHomeOfIjmeet() {
		HomePageTests rm = new HomePageTests();
		//HomePageTests rm = PageFactory.initElements(UIKeywords.driver,HomePageTests.class);
		rm.clickOnContactSales();
		//uk.driver.findElement(By.xpath("//a[@href=\"https://ijmeet.com/contact?csrt=4787608894725738589\"])[1]")).click();
     
	}
	
	@Test
	
	public void verifySignUpPage() throws InterruptedException {
		HomePageTests page = new HomePageTests();
		page.clickOnSignUp();
		
		SignUpTests su = new SignUpTests();
		su.enterFullName();
		su.enterCompanyName();
		su.enterEmailId();
		su.enterMobileNo();
		su.enterPassword();
		su.clickOnViewPassword();
		Thread.sleep(3000);
		su.clickOnViewPassword();
		////su.checkCaptcha();
		Thread.sleep(5000);
		//su.clickOnSignInWithGoogle();
		su.clickOnSignUp();

	}
	
	

}
