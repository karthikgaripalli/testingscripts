package com.tourRegisteration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tour_Registeration {

	
	public static void main(String[] args) {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Amar");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("12345678");
		driver.findElement(By.name("userName")).sendKeys("fdsfsad@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("secunderabad");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500061");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("ammarrr");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		
		driver.findElement(By.name("register")).click();
		
		
		String tar_name = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(tar_name.contains("ammarrr"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		driver.close();
			
		
	}

}
