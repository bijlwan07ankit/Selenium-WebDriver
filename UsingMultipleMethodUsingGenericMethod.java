package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingMultipleMethodUsingGenericMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("");
Select noOfEmpsdrop=new Select(driver.findElement(By.name("NoOfEmployees")));
Select industryDrp=new Select(driver.findElement(By.name(null)));
	}

}
