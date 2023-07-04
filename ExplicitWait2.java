package com.test;
import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		explicit wait 
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofMillis(10));
		
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By elelocator=By.xpath("//h3[text()='Selenium']");
		waitforElementPresent(driver,elelocator,10).click();
		
		
	}
//	Generic Methods
	public static WebElement waitforElementPresent(WebDriver driver,By locator, int timeout){
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	
	return driver.findElement(locator);

	
		
	}
}

