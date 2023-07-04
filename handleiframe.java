package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleiframe {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");	
	driver.manage().window().maximize();
	
//	First go to the frame then  go for find element
//	firsst frame
	
driver.switchTo().frame("packageListFrame");   //name of the frame if id is there put id directly
Thread.sleep(3000);
driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
driver.switchTo().defaultContent();   //switch back to home 
//secound frmae
driver.switchTo().frame("packageFrame");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
driver.switchTo().defaultContent();   // you can not go directly from 1 to 2 and 2 to 3 
//third frame 

driver.switchTo().frame("classFrame");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
//	driver.switchTo().defaultContent();  for that go to home page  first every time .
	}
    
}
