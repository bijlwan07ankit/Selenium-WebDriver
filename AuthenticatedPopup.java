package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntex
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		//http://user:password@URL
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
