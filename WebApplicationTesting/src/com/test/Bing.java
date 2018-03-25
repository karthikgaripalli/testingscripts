package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		WebElement HeaderBlock=driver.findElement(By.id("sc_hdu"));
		
		List<WebElement>links=HeaderBlock.findElements(By.tagName("a"));
		
		for(int i=1;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
driver.close();
	}

}
