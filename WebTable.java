package com.test;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
//		how many lines are there in a table 
int row =driver.findElements(By.xpath("//table[@id='countries']//tbody//tr")).size();
	System.out.println("no of row in the table is :  "+row);
	
//	2) How to find the table 
	int column =driver.findElements(By.xpath("//table[@id='countries']//tr//td//h3")).size();
	System.out.println("Total Number of column is :  "+column);
//	driver.quit();
	
//	To retrive a specific row or column 
  String Text =driver.findElement(By.xpath("//tbody//tr[10]//td[3]")).getText();
  System.out.println("The Value is : "+Text);
  
//  retrive all row and all column from the table 2 loop
   for(int i=1;i<=row;i++) {
	   
   
   for(int j=1;j<=column;j++) {
	   String value =driver.findElement(By.xpath("//tbody//tr["+i+"]td["+j+"]")).getText();
	   System.out.println("The Value is : "+value);
   }
   }
	}

}
