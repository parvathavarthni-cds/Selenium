package com.pom_without_pagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pom_hivelogin{
	static WebDriver driver;
	
		
		static By Email=By.xpath("//*[@id=\"user_email\"]");
		static By Password=By.xpath("//*[@id=\"user_password\"]");
		static By Login_button=By.xpath("//*[@id=\"m_login_signin_submit\"]");
		
		
		public pom_hivelogin(WebDriver driver)
		{
			this.driver=driver;
		}
		public void login() throws IOException
		{
			try
			{
			File src=new File("/home/parvathavarthini/Desktop/hive.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		    XSSFSheet sh1= wb.getSheet("Logincredentials");
		    
		    driver.findElement(Email).sendKeys(sh1.getRow(1).getCell(1).getStringCellValue());
		    driver.findElement(Password).sendKeys(sh1.getRow(1).getCell(2).getStringCellValue());
		    driver.findElement(Login_button).click();
			 } catch (Exception e) {

				   System.out.println(e.getMessage());

				  }
				  
			
		}
		
		
			
		}

	
