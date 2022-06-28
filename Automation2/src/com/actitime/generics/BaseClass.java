package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

  public static WebDriver driver;
  @BeforeTest
  public void openBrowser() {
	  Reporter.log("openBrowser");
}
	}


