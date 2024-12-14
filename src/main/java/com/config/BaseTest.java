package com.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.one.UIKeywords;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	

	@BeforeMethod
	public void openBrowser() {

		UIKeywords.launchBrowser("chrome");
		UIKeywords.launchURL("https://ijmeet.com");
	}

	//Nikhil bobade

	//@AfterMethod
	public void closeBrowser() {
		UIKeywords.driver.close();

	}

}
