package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
public class Runweb_browser {

	public static void main(String[] args) {
//		launch chrome browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bijlw\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
//		Or
//		WebDriver driver1 = new ChromeDriver();

		
//		by using web driver mannager 
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//		 URL
		driver.get("https://www.selenium.dev/about/"); //launch URL
	System.out.println("Title of the page is "+driver.getTitle());//print title of page 
	System.out.println("Title Of the web page is"+driver.getCurrentUrl());//print current url web page 
	System.out.println(driver.getPageSource());//printing HTML of current web page //page source of the web page 

	}

}


