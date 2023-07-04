package com.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSortedOrNOT {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@text()='Live Posting']")).click();   //live posting
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpselect = new Select(drpElement);
		List<WebElement>options=drpselect.getOptions();
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for (WebElement option:options)
		{
			originallist.add(option.getText());
			templist.add(option.getText());
		}
		System.out.println("Origionallist"+originallist);
		System.out.println("templist"+templist);
		
		Collections.sort(templist);
		
		System.out.println("after sorting Origionallist"+originallist);
		System.out.println("after sorting templist"+templist);
	
		if(originallist.equals(templist))
		{
			System.out.println("DropDown Sorted");
		}
		else {
			System.out.println("DropDown Unsorted");
		}
	}

}
