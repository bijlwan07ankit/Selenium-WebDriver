package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v110.input.Input;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class Assignment {

	public static void main(String[] args)  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watch");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
//		brand
		driver.findElement(By.xpath("//li[@id='p_89/Titan']//i[@class='a-icon a-icon-checkbox']")).click();
//		analogue 
		driver.findElement(By.xpath("//li[@id='p_n_feature_seven_browse-bin/1480900031']//i[@class='a-icon a-icon-checkbox']")).click();
//		more then 25%
		driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
//		material type
		driver.findElement(By.xpath("//li[@id='p_n_material_browse/1480907031']//i[@class='a-icon a-icon-checkbox']")).click();
		
		driver.findElement(By.xpath("//img[@alt=\"Titan Neo Iv Analog Black Dial Men's Watch-NL1802NL01\"]")).click();
		
		
	}

}
