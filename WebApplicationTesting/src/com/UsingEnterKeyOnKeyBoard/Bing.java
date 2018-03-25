package com.UsingEnterKeyOnKeyBoard;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bing 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		driver.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("Sridevi");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.RETURN).perform();
		
		
	}

}
