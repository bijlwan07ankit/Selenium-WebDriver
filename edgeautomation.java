package com.test;
import java.awt.Choice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Link;
import com.google.inject.spi.Element;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgeautomation {

	public static void main(String[] args) throws Throwable {
	int prg=1;
	while (prg==1) {
			
		
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
//Thread.sleep(2000);
driver.findElement(By.name("q")).sendKeys("Youtube");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
driver.findElement(By.name("btnK")).click();
Thread.sleep(10000);
driver.close();
Thread.sleep(1000);

	}
}}