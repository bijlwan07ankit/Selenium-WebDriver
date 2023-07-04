package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelEmentVSFindElements {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://demo.nopcommerce.com/");


//search element :   will find single web element 
//scenario 1 
//WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//searchbox.sendKeys("XYZ");

// scenario 2
//multiple webElement with find element 

//WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));    // will return first element only 
//System.out.println(ele.getText());      

//	3.  when element is not available  exception no such element 

//WebElement searchbutton=driver.findElement(By.xpath("//button[@type='login']"));
	
//	todo: findElements
//case 1:

//List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
//System.out.println("no of element captured is "+links.size());	
//for (WebElement ele:links)
//{
//	System.out.println(ele.getText());
//}


//case 2:

//List<WebElement>logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
//	System.out.println(logo.size());
	List<WebElement> element=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
	System.out.println(element.size());
	}

}
