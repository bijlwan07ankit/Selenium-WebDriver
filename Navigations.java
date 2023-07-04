package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		define webdriver as remote web driver to know the defination of get 
		
		RemoteWebDriver driver = new ChromeDriver();
		
//		launch 2 url
		
		driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=8af3fe193cfeeba1913ebd16acf58f97&utm_content=admitad_846&publisher_id=586854");
//		driver.get("https://www.amazon.in/");    //1
		
		driver.navigate().to("https://www.amazon.in"); //2      1 and 2 command are same  for launching the URL
//		now i want to go back and forward 
		
		driver.navigate().back();  // snapdeal
		driver.navigate().back();   //amazon
		driver.navigate().refresh();  //refresh
		
		

	}

}
