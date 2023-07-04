package com.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
	//	String WindowID= driver.getWindowHandle();
//		System.out.println("Window ID is "+WindowID);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowsIDS=driver.getWindowHandles();   // will give id of multiple window
		
////		1)first method iterator method 
		 
		/*Iterator <String> it = windowsIDS.iterator();
		String parentwindowID=it.next();
		String childwindowID=it.next();
		
		System.out.println("parentwindowid is "+parentwindowID);
		System.out.println("childwindowid is "+childwindowID);*/
		
//		2)Secound by list method
		List<String> windowsIDList=new ArrayList(windowsIDS);   //converting set into list 
		
		/*String parentwindowId=windowsIDList.get(0);
		String ChileWindowID=windowsIDList.get(1);
		
	System.out.println("Parent winddow id is : "+parentwindowId);
		System.out.println("child winddow id is : "+ChileWindowID);
		
	
		
		//how to use window id for switching 
		
		driver.switchTo().window(parentwindowId);
		System.out.println("perent windiw title is :"+driver.getTitle());
		
		driver.switchTo().window(ChileWindowID);
		System.out.println("child class window titile is :"+driver.getTitle());*/
		
//		using for each loop
		/*for (String winid :windowsIDList) {
//			System.out.println(winid);
			String title =driver.switchTo().window(winid).getTitle();
		System.out.println(title);*/
		
//		closing multiple browser window
		
		
//		driver.close();   // will close  single window(child window will close which is pinning 
//		driver.quit()    //both will close 
		
		for (String winid :windowsIDList) {
//			
			String title =driver.switchTo().window(winid).getTitle();    //by using condition 
		if (title.equals("OrangeHRM")) {
			driver.close();
		}
}
		}


}
