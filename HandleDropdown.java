package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement dropcountryEle=driver.findElement(By.id("input-country"));
		Select dropcountry=new Select(dropcountryEle);
		//dropcountry.selectByVisibleText("Denmark");
		//dropcountry.selectByValue("10");
//		dropcountry.selectByIndex(12);  //first element is empty 
		
		List<WebElement>alloption=dropcountry.getOptions();
		for (WebElement option:alloption) {
			if (option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		
			
		}
		
	}

}
