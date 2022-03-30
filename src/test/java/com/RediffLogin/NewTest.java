package com.RediffLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class NewTest {
public WebDriver driver;
	
	@Test(dataProvider="getData")
	public void Login(String uid, String pwd) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		  
		   driver = new ChromeDriver();
		   driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

		   driver.findElement(By.id("login1")).sendKeys(uid);
		   driver.findElement(By.id("password")).sendKeys(pwd);
		   driver.findElement(By.name("proceed")).click();
	}

@DataProvider
public Object[][] getData(){
	
	Object[][] data = new Object[1][2];
	
	data[0][0]="LN.2022@rediffmail.com";
	data[0][1]="Happy@1234";
	
	return data;
}

}
