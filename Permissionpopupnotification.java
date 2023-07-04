package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Permissionpopupnotification {
	public static void main(String[] args) {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(option); //now notification pop out  allow or block will not come 
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}


}
