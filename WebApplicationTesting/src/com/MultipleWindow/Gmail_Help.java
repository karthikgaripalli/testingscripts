package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Help {

	public static void main(String[] args)
	
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		System.out.println(driver.getTitle());
		
		String parent=driver.getWindowHandle();
		
		System.out.println(parent);
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String>Child=driver.getWindowHandles();
		
		System.out.println(Child);
		
		for(String h:Child)
		{
			if(!h.equals(parent))
			{
				driver.switchTo().window(h);
				
				System.out.println(driver.getTitle());
				String text=driver.findElement(By.linkText("Create a Google Account")).getText();
				System.out.println(text);
				
				driver.findElement(By.linkText("Create a Google Account")).click();
				
				System.out.println(driver.getTitle());
				
			}
			driver.close();
		}
			
		
	driver.close();
		
		

	}

}
