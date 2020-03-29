package com.testMaven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

	private WebDriver driver;

	@Test
	public void f() {
		driver.get("https://accounts.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

	@BeforeTest
	public void beforeTest() {

		String exePath = "/usr/bin/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
