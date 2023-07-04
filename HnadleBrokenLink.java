package com.test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HnadleBrokenLink {

	public static void main(String[] args) throws IOException  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement ele :list) {
		String url=	ele.getAttribute("href");
		if(url==null || url.isEmpty()) {
			System.out.println("URL is empty");
			continue;
		}
		URL link  = new URL(url);
		try {
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			httpconn.connect();
			
			if(httpconn.getResponseCode()>=400);
			{
				System.out.println(httpconn.getResponseCode()+" is"+"Broken link");
			    brokenlinks++;
			}
			else
			{
				System.out.println(httpconn.getResponseCode()+" is"+"valid link");
			}
		}
			catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}

	}

}
