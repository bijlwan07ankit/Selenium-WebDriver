package com.test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		alert window eith a button 
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		
//		alert window by ok or cancle button 
		
		/*driver.findElement(By.xpath(" (//button[normalize-space()='Click for JS Confirm'])[1]")).click();
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
//		alert window with input box, capture text from alert
		
		driver.findElement(By.xpath(" (//button[normalize-space()='Click for JS Prompt'])[1]")).click();
		Thread.sleep(3000);
		Alert alertWindow=driver.switchTo().alert();
		System.out.println("The  message displayed on alert "+alertWindow.getText());
		alertWindow.sendKeys("Welcome");
		alertWindow.accept();
		
		
		
		
	}

}
