package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVSGetAttribureValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement emailinputbox=driver.findElement(By.id("Email"));
//		emailinputbox.clear();
//		emailinputbox.sendKeys("admin@gmail.com");

//		todo: how to capture the value from input box
		
	emailinputbox.getAttribute("value");
	System.out.println("result from getattribute method"+emailinputbox.getAttribute ("value"));
	System.out.println("result from getText method"+emailinputbox.getText());
	
	
//	for log in 
	WebElement button =driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(button.getAttribute("type"));   //submit
	System.out.println(button.getAttribute("class")); // button-1-login=button
	System.out.println(button.getText());      //login
	
//	title of the page 
	String title=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
	
	System.out.println(title);
		
		

	}

}
