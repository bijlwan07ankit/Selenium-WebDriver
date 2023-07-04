package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleLinks {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
//		 driver.findElement(By.linkText("Today's Deals")).click();    //full value 
		 driver.findElement(By.partialLinkText("Deals")).click();	  //with half value
		 
		 
//		 how to capture all the links present in page
		 
		List<WebElement> links= driver.findElements(By.tagName("a"));  //will capture all the link and save in a list 
		System.out.println("no of links present: "+links.size());
		System.out.println(links);
		
//		for(int i=0;i<=links.size();i++) {
//		
//		System.out.println(links.get(i).getText());
//		System.out.println(links.get(i).getAttribute("href"));
//		}
//		for each loop 
		for (WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		  
	}

}
