package com.one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;

	public static void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		} else {
			System.err.println("invalid browsername");
		}
	}

	public static void launchURL(String url) {
		driver.get(url);
		
	}

	public String getTitle() {
		return driver.getTitle();
		
	}

	public  void closeBrowser() {
		driver.close();
		
	}

	public void click(String locator) {
		 driver.findElement(By.cssSelector(locator)).click();
		
	}

	public static void enterText(String locator,String textToEnter) {
		driver.findElement(By.cssSelector(locator)).sendKeys(textToEnter);
		
	}

	
	
}
