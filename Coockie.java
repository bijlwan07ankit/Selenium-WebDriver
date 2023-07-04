package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coockie {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://watchdocumentaries.com/cookie-clicker-game/");
	Thread.sleep(3000);
	int x=0;
	while (x==1) {
	 driver.findElement(By.xpath("//div[@id='cookies']")).click();
	}
	}
}