package com.RediffLogin;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSONTestData{
	
	public static WebDriver driver;
	
public void getData(String userid, String userPwd) {	
	JSONParser jp = new JSONParser();

	
	
	try {
			FileReader reader = new FileReader("C:\\QEA21QE055\\simple.json");
			
			Object obj = jp.parse(reader);
			JSONObject jo = (JSONObject) obj;
			String uid = (String) jo.get("userid");
			System.out.println(uid);
			String pwd = (String) jo.get("password");
			System.out.println(pwd);
						
}catch(Exception e) {
	System.out.println(e);
}
}
}
