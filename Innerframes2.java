package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author bijlw
 *
 */
public class Innerframes2 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult"); //switch to jouter frame;
	
//	driver.findElement(By.xpath("//div[@id='iframecontainer']")).getText(); or by index beacouse we have only 1 i frame inside 
	driver.switchTo().frame(0);   //switch to inner i frame 
	System.out.println("text present inside the inner iframe :  "+driver.findElement(By.xpath("//h1")).getText());

//now how to go from inner frame to prent  frame not default frame 
	
	driver.switchTo().parentFrame();//switch to perent frame /outer frame
	System.out.println("the perent frame text is : "+driver.findElement(By.xpath("//p")).getText());

}
}
