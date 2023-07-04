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

public class AutoSugestDropDown_googleSearch {

	public static void main(String[] args) {

				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.Google.com/");
				driver.manage().window().maximize();
				driver.findElement(By.name("q")).sendKeys("java tutorial");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				List<WebElement>list = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='pcTkSc']"));
				System.out.println(list.size());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				for (WebElement listitem:list) {
				listitem.getText().contains("javascript tutorial");
				listitem.click();
					break;
					
				}
				
				
				/*List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
			System.out.println("Size of auto Search"+list.size());
			for(WebElement listItem:list) {
				if (listItem.equals("selenium webdriver")) {
					listItem.click();
					break;*/
				

	}
}
