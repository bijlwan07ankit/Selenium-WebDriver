package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Status_of_web_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		no need to downloade any driver in this 
		WebDriverManager.chromedriver().setup(); //autometically set up the driver
		WebDriver driver = new ChromeDriver();
		
		//isDisplayed()   isEnabled()
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");   //launch the URl
//		need locator for that capture x path 
		
//		locate the  element 
		WebElement searchStore=driver.findElement(By.xpath("//div[@class='search-box store-search-box']"));
		
//		method for checking is it found  there or not  it will return true or false  +searchStore.isDisplayed());
		
		System.out.println("Display Status: "+searchStore.isDisplayed());    //true
		
		//IsDisplayed()[web element  is displayed or not ] and IsEnabled[element is enable or not ]      boolean value 
		 
//		isEnable() 
		
		System.out.println("Display Status:"+searchStore.isEnabled());  //true
		
//	//:isSelected()   //we can check weather the element is selected or not  we can check or uncheck the value  return boolean value 
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected());  //false
		System.out.println(female.isSelected()); //false
		
		// i want to select male button  
		male.click() ;  //select male 
		System.out.println(male.isSelected());  //true
		System.out.println(female.isSelected());  //false
		
		female.click(); //select female
		
		System.out.println(male.isSelected());  //false
		System.out.println(female.isSelected());  //true
		
		

		
	}

}
