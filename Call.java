package com.pom_without_pagefactory;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Call {
	static WebDriver driver;
	String mail="parvatha.varthni@crystaldelta.com";
	String password="T$sthive1226";

	@Test
	public void setup() throws IOException, InterruptedException
	{
		  WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();			
	        driver.get("https://qa-hive.powerwrap.com.au/");		
	        driver.manage().window().maximize();
	        pom_hivelogin hie=new pom_hivelogin(driver);
	        hie.login();
	        
	        
	        pom_ticket tck=new pom_ticket(driver);
	        tck.switch_advisor();
	}
//	@After
//	public void quit()
//	{
	
//		driver.close();
//	}
}
