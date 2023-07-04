package com.test;
import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inneriframe {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
 driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click(); //secound button 
 WebElement outeriframe= driver.findElement(By.xpath("//div[@class='container iframes-page-container']")); //outer iframe
	driver.switchTo().frame(outeriframe); //here we are passing frame as a web element 
	
	WebElement innerFrame=driver.findElement(By.xpath("//div[@class='container']"));
	driver.switchTo().frame(innerFrame);

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
//	 still  not solved completly 
	}

}
