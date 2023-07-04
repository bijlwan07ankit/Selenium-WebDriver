package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//1).selecting one element
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//2).select multiple /all  checkbox
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
		System.out.println("total check boxes are "+checkbox.size());
		
		/*for loop 
		for (int i=0;i<=checkbox.size();i++) 
		{
			checkbox.get(i).click();
		}*/
		
//		for each loop 
		
//		for (WebElement chkbox:checkbox) {
//			chkbox.click();
//		}
		
//		3) select checkbox base on choice
//		for (WebElement chkbox:checkbox) {
//		String checkboxname=chkbox.getAttribute("id");
//		
//		if(checkboxname.equals("monday")||checkboxname.equals("sunday")) {
//			chkbox.click();
//		}
		
//		4) selecting last two and first 2 check box
//		last 2
		
//		for (int i=checkbox.size()-2;i<=checkbox.size();i++) {
//			checkbox.get(i).click();
			
//			first 2
			
			for (int i=0;i<=2;i++) {
				checkbox.get(i).click();
			
		}
//	}

	}
}
