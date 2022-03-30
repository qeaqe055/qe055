package com.RediffLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


	public WebDriver getWebDriver(WebDriver driver) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	  
	   driver = new ChromeDriver();
	  driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

	  return driver;
	}
}
