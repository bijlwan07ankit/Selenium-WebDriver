package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteGooglePlacesDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement SearchBox=driver.findElement(By.id("autocomplete"));
		SearchBox.clear();
		SearchBox.sendKeys("Toronto");
		Thread.sleep(3000);
		String text;
		do {
			SearchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text=SearchBox.getAttribute("value");
			if(text.equals("Toronto, OH, USA")) 
			{
				SearchBox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}
		
		while(!text.isEmpty());
		
	}

}
