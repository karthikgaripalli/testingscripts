package com.DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursUserRegistrationTest
{
		FirefoxDriver driver;
		@BeforeTest
		
		public void ApplLaunch()
		{
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
		}
		
		@Test
		public void UserRegistration() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
		{
	driver.findElement(By.linkText("REGISTER")).click();
			
			Sleeper.sleepTightInSeconds(10);
			
			Connection conn=null;
			
			String url="jdbc:mysql://localhost:3306/";
			String dbname="test";
			String DBdriver="com.mysql.jdbc.Driver";
			String UserName="root";
			String Password="srinu4lr";
			
			Class.forName(DBdriver).newInstance();
			conn = DriverManager.getConnection(url+dbname,UserName,Password);
			PreparedStatement psmt = conn.prepareStatement("select *from Register");
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next())
			{
				driver.findElement(By.name("firstName")).sendKeys(rs.getString(1));
				driver.findElement(By.name("lastName")).sendKeys(rs.getString(2));
				driver.findElement(By.name("phone")).sendKeys(rs.getString(3));
				driver.findElement(By.name("userName")).sendKeys(rs.getString(4));
				driver.findElement(By.name("address1")).sendKeys(rs.getString(5));
				driver.findElement(By.name("city")).sendKeys(rs.getString(6));
				driver.findElement(By.name("state")).sendKeys(rs.getString(7));
				driver.findElement(By.name("postalCode")).sendKeys(rs.getString(8));
				driver.findElement(By.name("country")).sendKeys(rs.getString(9));
				driver.findElement(By.id("email")).sendKeys(rs.getString(10));
				driver.findElement(By.name("password")).sendKeys(rs.getString(11));
				driver.findElement(By.name("confirmPassword")).sendKeys(rs.getString(12));
				
				driver.findElement(By.name("register")).click();
				
				Sleeper.sleepTightInSeconds(10);
				
				driver.navigate().back();
		}
		
			conn.close();
			
			driver.close();
	}

}
