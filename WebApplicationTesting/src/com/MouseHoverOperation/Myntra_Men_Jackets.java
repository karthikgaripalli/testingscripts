package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Men_Jackets
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://qedgetech.in");
		
		WebElement Resource=driver.findElement(By.xpath(".//*[@id='main-menu-item-557']/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Resource).perform();
		
		driver.findElement(By.linkText("Projects")).click(); 

	}

}
