package com.test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQuaryDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		SelectChoiceValues(driver, "choice 1");
//		SelectChoiceValues(driver,"choice1","choice2","choice 1 2");
//		SelectChoiceValues(driver,"all");
	
	
	}
	public static void SelectChoiceValues(WebDriver driver, String... Value)
	{
	List <WebElement> ChoiceList=driver.findElements(By.xpath("comboTreeItemTitle"));
	if (!Value[0].equalsIgnoreCase("all"))
	{
		for (WebElement item : ChoiceList)
		
		{
			String text=item.getText();
			for(String val:Value)
			{
				if(text.equals(val))
				{
					item.click();
					break;
				}
				
			}
			
		}
		
	}
	else
	{
		for(WebElement item: ChoiceList)
			item.click();
		{
			
		}
	}
	}

		}


