package com.FileDownLoad;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumServerDownload {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Sys\\Desktop\\WeekEndBatch\\WebApplicationTesting\\AutoItScripts\\UploadImage.exe");

	}

}
