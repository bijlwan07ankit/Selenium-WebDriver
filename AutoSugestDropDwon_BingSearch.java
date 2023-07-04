package com.test;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugestDropDwon_BingSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
	System.out.println("Size of auto Search"+list.size());
	for(WebElement listItem:list) {
		if (listItem.getText().contains("selenium webdriver")) {
			listItem.click();
			break;
		}
		
	}
	}

}
